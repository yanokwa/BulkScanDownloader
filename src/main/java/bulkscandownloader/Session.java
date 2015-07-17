package bulkscandownloader;

import org.codehaus.jackson.annotate.JsonProperty;

public class Session {

	@JsonProperty("ID")
	private String sessionID;
	@JsonProperty("SessionType")
	private int sessionType;

	public Session() {
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
	}

	public String getSessionType() {
        if (sessionType == 1)
            return "FrontSession";
		return String.format("%d", sessionType);
	}

	public void setSessionType(int sessionType) {
		this.sessionType = sessionType;
	}
}
