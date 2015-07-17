package bulkscandownloader;

public class User {
    private boolean active;
    private String username;
    private String password;
    private boolean allEnvelopeSides;
    private boolean contentScans;
    private boolean envelopeImages;

    public User() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAllEnvelopeSides() {
        return allEnvelopeSides;
    }

    public void setAllEnvelopeSides(boolean allEnvelopeSides) {
        this.allEnvelopeSides = allEnvelopeSides;
    }

    public boolean isContentScans() {
        return contentScans;
    }

    public void setContentScans(boolean contentScans) {
        this.contentScans = contentScans;
    }

    public boolean isEnvelopeImages() {
        return envelopeImages;
    }

    public void setEnvelopeImages(boolean envelopeImages) {
        this.envelopeImages = envelopeImages;
    }

    public String toString() {
        return String.format("User [active=%s, username=%s, allEnvelopeSides=%s, contentScans=%s, envelopeImages=%s]",
                active,
                username,
                allEnvelopeSides,
                contentScans,
                envelopeImages);
    }
}
