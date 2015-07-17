package bulkscandownloader;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;
import java.util.HashMap;

/*
 * The Session returned from a successful session creation will look like this
 *
 *  {
 *    "Session": {
 *      "SessionID": {
 *        "ID": "some-id",
 *        "SessionType": 1
 *      }
 *    },
 *    "Identity": {
 *      "DisplayName": "Doe, John",
 *      "ExternalID": null,
 *      "IdentityType": 1,
 *      "IrisIdentityID": {
 *        "ID": 1
 *      },
 *      "IrisUserID": {
 *        "ID": 1
 *      },
 *      "Name": "johndoe",
 *      "OpsUserID": null
 *    },
 *    "PersistentLoginGranted": false,
 *    "AbsoluteExpiryDate": null
 *  }
 */
public class JSONAuthSession {
    @JsonProperty("Session")
    private SessionContainer session;
    @JsonProperty("Identity")
    private HashMap<String, Object> identity;
    @JsonProperty("PersistentLoginGranted")
    private boolean persistentLoginGranted;
    @JsonProperty("AbsoluteExpiryDate")
    private Date absoluteExpiryDate;

    public JSONAuthSession() {

    }

    public Session getSession() {
        return session.getSessionID();
    }

    public void setSession(SessionContainer session) {
        this.session = session;
    }

    public HashMap<String, Object> getIdentity() {
        return identity;
    }

    public void setIdentity(HashMap<String, Object> identity) {
        this.identity = identity;
    }

    public boolean isPersistentLoginGranted() {
        return persistentLoginGranted;
    }

    public void setPersistentLoginGranted(boolean persistentLoginGranted) {
        this.persistentLoginGranted = persistentLoginGranted;
    }

    public Date getAbsoluteExpiryDate() {
        return absoluteExpiryDate;
    }

    public void setAbsoluteExpiryDate(Date absoluteExpiryDate) {
        this.absoluteExpiryDate = absoluteExpiryDate;
    }

    private class SessionContainer {
        @JsonProperty("SessionID")
        private Session sessionID;

        public SessionContainer() {

        }

        public Session getSessionID() {
            return sessionID;
        }
        public void setSessionID(Session sessionID) {
            this.sessionID = sessionID;
        }
    }
}
