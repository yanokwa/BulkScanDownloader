/**
 * IrisIdentityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class IrisIdentityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IrisIdentityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Iris = "Iris";
    public static final java.lang.String _Windows = "Windows";
    public static final java.lang.String _System = "System";
    public static final java.lang.String _OpsUser = "OpsUser";
    public static final IrisIdentityType Unknown = new IrisIdentityType(_Unknown);
    public static final IrisIdentityType Iris = new IrisIdentityType(_Iris);
    public static final IrisIdentityType Windows = new IrisIdentityType(_Windows);
    public static final IrisIdentityType System = new IrisIdentityType(_System);
    public static final IrisIdentityType OpsUser = new IrisIdentityType(_OpsUser);
    public java.lang.String getValue() { return _value_;}
    public static IrisIdentityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IrisIdentityType enumeration = (IrisIdentityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IrisIdentityType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IrisIdentityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "IrisIdentityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
