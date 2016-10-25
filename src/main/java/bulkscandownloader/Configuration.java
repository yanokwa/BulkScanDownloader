package bulkscandownloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Configuration {

    private String rootDir;
    private int postDownloadAction;
    private boolean useFolders;
    private boolean daemonMode;
    private User[] users;
    private URL frontSessionURL;
    private URL downloadServiceURL;

    public Configuration() {}

    public String getRootDir() {
        return rootDir;
    }

    public void setRootDir(String rootDir) {
        this.rootDir = rootDir.replaceFirst("^~",System.getProperty("user.home"));
    }

    public int getPostDownloadAction() {
        return postDownloadAction;
    }

    public void setPostDownloadAction(int postDownloadAction) {
        this.postDownloadAction = postDownloadAction;
    }

    public boolean isUseFolders() {
        return useFolders;
    }

    public void setUseFolders(boolean useFolders) {
        this.useFolders = useFolders;
    }

    public boolean isDaemonMode() {
        return daemonMode;
    }

    public void setDaemonMode(boolean daemonMode) {
        this.daemonMode = daemonMode;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public URL getFrontSessionURL() {
        return frontSessionURL;
    }

    public void setFrontSessionURL(String frontSessionURL) throws MalformedURLException {
        this.frontSessionURL = new URL(frontSessionURL);
    }

    public URL getDownloadServiceURL() {
        return downloadServiceURL;
    }

    public void setDownloadServiceURL(String downloadServiceURL) throws MalformedURLException {
        this.downloadServiceURL = new URL(downloadServiceURL);
    }

    public String toString() {
        return String.format("Config [rootDir=%s, postDownloadAction=%s, useFolders=%s, daemonMode=%s, users=%s",
                this.rootDir,
                this.postDownloadAction,
                this.useFolders,
                this.daemonMode,
                Arrays.toString(users));
    }

}