package bulkscandownloader;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Paths;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.xml.rpc.ServiceException;


/**
 * Earth Class Mail BulkScanDownloader
 *
 */
public class BulkScanDownloader {

    public static final boolean DEBUG_BUILD = false;

    private static final Logger logger = LogManager.getLogger(BulkScanDownloader.class);
	
	public static void main(String[] args) {
        logger.info("Starting BulkScanDownloader");
        // Read the configuration file "bulkscandownloader.json" from current working directory
        ObjectMapper mapper = new ObjectMapper();
        String cwd = System.getProperty("user.dir");
        String configFile = Paths.get(cwd, "bulkscandownloader.json").toString();
        Configuration config = null;
        try {
            config = mapper.readValue(new File(configFile), Configuration.class);
        } catch (Exception e) {
            logger.error("Can not parse configuration file");
            logger.error(e);
            System.exit(1);
        }

        // Set URLs we want to hit and initialize the downloader
        try {
            config.setFrontSessionURL("https://secure.earthclassmail.com/Services/Secured/IrisFrontAuthServiceAjax.svc/CreateFrontSession");
            config.setDownloadServiceURL("https://secure.earthclassmail.com/Services/ScanDownload2");
        } catch (MalformedURLException e) {
            logger.error("Invalid URLs provided for service endpoints");
            System.exit(1);
        }

        try {
            Downloader client = new Downloader(config);
            client.run();
        } catch (ServiceException e) {
            logger.error("Unable to contact download service, shutting down.");
        } catch (InterruptedException e) {
            logger.info("Program interrupted, shutting down.");
        }
	}
}
