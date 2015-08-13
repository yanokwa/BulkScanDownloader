package bulkscandownloader;

import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import iris.ContentDownloadService;
import iris.ContentDownloadServiceImplLocator;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;
import org.glassfish.jersey.client.ClientProperties;

public class Authentication {

    private static final Logger logger = LogManager.getLogger(Authentication.class);

    Client client;
    private Session session;
    private URL endpoint;
    private ContentDownloadService downloadService;

    public Authentication(URL endpoint) {
        this.endpoint = endpoint;
        this.client = ClientBuilder.newClient();
        this.client.property(ClientProperties.CONNECT_TIMEOUT, 60*1000);
        this.client.property(ClientProperties.READ_TIMEOUT, 60*1000);
    }

    public void signIn(String username, String password) throws Exception {
        Entity payload = Entity.json("{ \"ClientType\": 6,  \"Password\": \"" + password + "\", \"UserName\": \"" + username + "\"}");
        Response response = client.target(endpoint.toString()).request(MediaType.APPLICATION_JSON_TYPE).post(payload);

        String res = response.readEntity(String.class);

        try {
            JSONAuthSession jsonSession = new ObjectMapper().readValue(res, JSONAuthSession.class);
            this.session = jsonSession.getSession();
            ((Stub) this.downloadService).clearHeaders();
            ((Stub) this.downloadService).setHeader(this.getSoapSessionHeader());
        } catch (UnrecognizedPropertyException e) {
            JSONAuthFault fault = new ObjectMapper().readValue(res, JSONAuthFault.class);
            logger.error("Could not sign in user `" + username + "`, reason:");
            logger.error(fault.getMessage());
            throw new Exception("Unable to sign in");
        }
    }

    /*
     * The SOAP Headers need to contain the following session information to be authenticated
     *
     * <IrisSession xmlns="uri:iris" xmlns:i="http://www.w3.org/2001/XMLSchema-instance">
     *  <IrisSession>
     *    <SessionID>
     *      <ID>633dde76-a22a-43b1-a904-c99a8fe09945</ID>
     *      <SessionType>FrontSession</SessionType>
     *    </SessionID>
     *   </IrisSession>
     * </IrisSession>
     */
    public SOAPHeaderElement getSoapSessionHeader() throws SOAPException {
        SOAPHeaderElement topSession = new SOAPHeaderElement("uri:iris", "IrisSession");
        SOAPHeaderElement session = new SOAPHeaderElement("uri:iris", "IrisSession");
        SOAPHeaderElement sessionId = new SOAPHeaderElement("uri:iris", "SessionID");
        SOAPHeaderElement id = new SOAPHeaderElement("uri:iris", "ID", this.session.getSessionID());
        SOAPHeaderElement sessionType = new SOAPHeaderElement("uri:iris", "SessionType", this.session.getSessionType());
        sessionId.addChild(id);
        sessionId.addChild(sessionType);
        session.addChild(sessionId);
        topSession.addChild(session);

        return topSession;
    }

    public Session getSession() {
        return this.session;
    }

    public ContentDownloadService getDownloadService(URL endpoint) throws ServiceException {
        if (this.downloadService == null) {
            ContentDownloadServiceImplLocator wsLocator = new ContentDownloadServiceImplLocator();
            this.downloadService = wsLocator.getBasicHttpBinding_ContentDownloadService(endpoint);
        }

        return this.downloadService;
    }
}
