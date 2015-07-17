/**
 * PItemStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class PItemStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PItemStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Active = "Active";
    public static final java.lang.String _Shipped = "Shipped";
    public static final java.lang.String _Shredded = "Shredded";
    public static final java.lang.String _Recycled = "Recycled";
    public static final java.lang.String _Returned = "Returned";
    public static final java.lang.String _AtMyDesk = "AtMyDesk";
    public static final java.lang.String _Abandoned = "Abandoned";
    public static final java.lang.String _PickedUp = "PickedUp";
    public static final java.lang.String _Virtual = "Virtual";
    public static final PItemStatus Unknown = new PItemStatus(_Unknown);
    public static final PItemStatus Active = new PItemStatus(_Active);
    public static final PItemStatus Shipped = new PItemStatus(_Shipped);
    public static final PItemStatus Shredded = new PItemStatus(_Shredded);
    public static final PItemStatus Recycled = new PItemStatus(_Recycled);
    public static final PItemStatus Returned = new PItemStatus(_Returned);
    public static final PItemStatus AtMyDesk = new PItemStatus(_AtMyDesk);
    public static final PItemStatus Abandoned = new PItemStatus(_Abandoned);
    public static final PItemStatus PickedUp = new PItemStatus(_PickedUp);
    public static final PItemStatus Virtual = new PItemStatus(_Virtual);
    public java.lang.String getValue() { return _value_;}
    public static PItemStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PItemStatus enumeration = (PItemStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PItemStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PItemStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "PItemStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
