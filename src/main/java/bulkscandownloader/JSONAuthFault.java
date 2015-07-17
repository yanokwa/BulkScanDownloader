package bulkscandownloader;

import org.codehaus.jackson.annotate.JsonProperty;

/*
 * The AuthFault returned from a failed session creation attempt will look like this
 *
 * {
 *    "CorrelationGuid": "some-guid",
 *    "Detail": {
 *      "__type": "AuthFault:uri:iris",
 *      "Identity": null,
 *      "Reason": 1,
 *      "ReasonCode": "BadUsernameOrPassword"
 *    },
 *    "FaultType": "AuthFault",
 *    "Message": "Auth Error: BadUsernameOrPassword: Username=x (Duration=y) (Guid: some-guid)"
 *  }
 */
public class JSONAuthFault {
    @JsonProperty("CorrelationGuid")
    private String correlationGuid;
    @JsonProperty("Detail")
    private FaultDetail detail;
    @JsonProperty("FaultType")
    private String faultType;
    @JsonProperty("Message")
    private String message;

    public JSONAuthFault() {
    }

    public String getCorrelationGuid() {
        return correlationGuid;
    }

    public void setCorrelationGuid(String correlationGuid) {
        this.correlationGuid = correlationGuid;
    }

    public FaultDetail getDetail() {
        return detail;
    }

    public void setDetail(FaultDetail detail) {
        this.detail = detail;
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private class FaultDetail {
        @JsonProperty("__type")
        public String type;
        @JsonProperty("Identity")
        public String identity;
        @JsonProperty("Reason")
        public int reason;
        @JsonProperty("ReasonCode")
        public String reasonCode;

        public FaultDetail() {
        }

        public String get__type() {
            return type;
        }

        public void set__type(String __type) {
            this.type = __type;
        }

        public String getIdentity() {
            return identity;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }

        public int getReason() {
            return reason;
        }

        public void setReason(int reason) {
            this.reason = reason;
        }

        public String getReasonCode() {
            return reasonCode;
        }

        public void setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
        }
    }
}

