/**
 * AuthFaultReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class AuthFaultReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthFaultReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _BadUsernameOrPassword = "BadUsernameOrPassword";
    public static final java.lang.String _InvalidSessionID = "InvalidSessionID";
    public static final java.lang.String _AccountFraud = "AccountFraud";
    public static final java.lang.String _AccountClosed = "AccountClosed";
    public static final java.lang.String _AccountTerminated = "AccountTerminated";
    public static final java.lang.String _SessionExpired = "SessionExpired";
    public static final java.lang.String _InvalidCertificate = "InvalidCertificate";
    public static final java.lang.String _InvalidSubject = "InvalidSubject";
    public static final java.lang.String _InvalidUsername = "InvalidUsername";
    public static final java.lang.String _MissingOpsUser = "MissingOpsUser";
    public static final java.lang.String _NoAssociatedIdentity = "NoAssociatedIdentity";
    public static final java.lang.String _MissingSubsystemUser = "MissingSubsystemUser";
    public static final java.lang.String _InvalidSessionType = "InvalidSessionType";
    public static final java.lang.String _ConfigurationError = "ConfigurationError";
    public static final java.lang.String _NoSessionFromClient = "NoSessionFromClient";
    public static final java.lang.String _DataError = "DataError";
    public static final java.lang.String _PasswordExpired = "PasswordExpired";
    public static final java.lang.String _AuthenticationLimitReached = "AuthenticationLimitReached";
    public static final java.lang.String _InvalidUserID = "InvalidUserID";
    public static final java.lang.String _DeletedUser = "DeletedUser";
    public static final java.lang.String _BadToken = "BadToken";
    public static final java.lang.String _BadCertificate = "BadCertificate";
    public static final java.lang.String _UnknownCertificate = "UnknownCertificate";
    public static final java.lang.String _UnacceptableCertificate = "UnacceptableCertificate";
    public static final java.lang.String _InvalidPasswordToken = "InvalidPasswordToken";
    public static final java.lang.String _ExpiredPasswordToken = "ExpiredPasswordToken";
    public static final java.lang.String _ResetTooRecentlyRequested = "ResetTooRecentlyRequested";
    public static final java.lang.String _UnknownOpenID = "UnknownOpenID";
    public static final java.lang.String _InvalidAuthType = "InvalidAuthType";
    public static final java.lang.String _OpenIDAlreadyInUse = "OpenIDAlreadyInUse";
    public static final java.lang.String _LoginMethodNotRemovable = "LoginMethodNotRemovable";
    public static final java.lang.String _UnverifiedIdentity = "UnverifiedIdentity";
    public static final java.lang.String _AccountUncommitted = "AccountUncommitted";
    public static final java.lang.String _NotAuthorized = "NotAuthorized";
    public static final AuthFaultReason Unknown = new AuthFaultReason(_Unknown);
    public static final AuthFaultReason BadUsernameOrPassword = new AuthFaultReason(_BadUsernameOrPassword);
    public static final AuthFaultReason InvalidSessionID = new AuthFaultReason(_InvalidSessionID);
    public static final AuthFaultReason AccountFraud = new AuthFaultReason(_AccountFraud);
    public static final AuthFaultReason AccountClosed = new AuthFaultReason(_AccountClosed);
    public static final AuthFaultReason AccountTerminated = new AuthFaultReason(_AccountTerminated);
    public static final AuthFaultReason SessionExpired = new AuthFaultReason(_SessionExpired);
    public static final AuthFaultReason InvalidCertificate = new AuthFaultReason(_InvalidCertificate);
    public static final AuthFaultReason InvalidSubject = new AuthFaultReason(_InvalidSubject);
    public static final AuthFaultReason InvalidUsername = new AuthFaultReason(_InvalidUsername);
    public static final AuthFaultReason MissingOpsUser = new AuthFaultReason(_MissingOpsUser);
    public static final AuthFaultReason NoAssociatedIdentity = new AuthFaultReason(_NoAssociatedIdentity);
    public static final AuthFaultReason MissingSubsystemUser = new AuthFaultReason(_MissingSubsystemUser);
    public static final AuthFaultReason InvalidSessionType = new AuthFaultReason(_InvalidSessionType);
    public static final AuthFaultReason ConfigurationError = new AuthFaultReason(_ConfigurationError);
    public static final AuthFaultReason NoSessionFromClient = new AuthFaultReason(_NoSessionFromClient);
    public static final AuthFaultReason DataError = new AuthFaultReason(_DataError);
    public static final AuthFaultReason PasswordExpired = new AuthFaultReason(_PasswordExpired);
    public static final AuthFaultReason AuthenticationLimitReached = new AuthFaultReason(_AuthenticationLimitReached);
    public static final AuthFaultReason InvalidUserID = new AuthFaultReason(_InvalidUserID);
    public static final AuthFaultReason DeletedUser = new AuthFaultReason(_DeletedUser);
    public static final AuthFaultReason BadToken = new AuthFaultReason(_BadToken);
    public static final AuthFaultReason BadCertificate = new AuthFaultReason(_BadCertificate);
    public static final AuthFaultReason UnknownCertificate = new AuthFaultReason(_UnknownCertificate);
    public static final AuthFaultReason UnacceptableCertificate = new AuthFaultReason(_UnacceptableCertificate);
    public static final AuthFaultReason InvalidPasswordToken = new AuthFaultReason(_InvalidPasswordToken);
    public static final AuthFaultReason ExpiredPasswordToken = new AuthFaultReason(_ExpiredPasswordToken);
    public static final AuthFaultReason ResetTooRecentlyRequested = new AuthFaultReason(_ResetTooRecentlyRequested);
    public static final AuthFaultReason UnknownOpenID = new AuthFaultReason(_UnknownOpenID);
    public static final AuthFaultReason InvalidAuthType = new AuthFaultReason(_InvalidAuthType);
    public static final AuthFaultReason OpenIDAlreadyInUse = new AuthFaultReason(_OpenIDAlreadyInUse);
    public static final AuthFaultReason LoginMethodNotRemovable = new AuthFaultReason(_LoginMethodNotRemovable);
    public static final AuthFaultReason UnverifiedIdentity = new AuthFaultReason(_UnverifiedIdentity);
    public static final AuthFaultReason AccountUncommitted = new AuthFaultReason(_AccountUncommitted);
    public static final AuthFaultReason NotAuthorized = new AuthFaultReason(_NotAuthorized);
    public java.lang.String getValue() { return _value_;}
    public static AuthFaultReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthFaultReason enumeration = (AuthFaultReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthFaultReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthFaultReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "AuthFaultReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
