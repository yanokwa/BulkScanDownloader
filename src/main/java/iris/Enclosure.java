/**
 * Enclosure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class Enclosure  extends iris.DownloadableContent  implements java.io.Serializable {

    private org.apache.axis.types.UnsignedByte side;

    public Enclosure() {
    }

    public Enclosure(
           iris.FileStoreContentType contentType,
           java.util.Calendar createDate,
           iris.ExtractStatus extractStatus,
           java.lang.String folderName,
           iris.PItemStatus itemStatus,
           iris.LicensePlate licensePlate,
           iris.MailboxID mailboxID,
           iris.OperationType operation,
           java.lang.Long sizeBytes,
           iris.VItemID VItemID,
           org.apache.axis.types.UnsignedByte side) {
        super(
            contentType,
            createDate,
            extractStatus,
            folderName,
            itemStatus,
            licensePlate,
            mailboxID,
            operation,
            sizeBytes,
            VItemID);
        this.side = side;
    }


    /**
     * Gets the side value for this Enclosure.
     * 
     * @return side
     */
    public org.apache.axis.types.UnsignedByte getSide() {
        return side;
    }


    /**
     * Sets the side value for this Enclosure.
     * 
     * @param side
     */
    public void setSide(org.apache.axis.types.UnsignedByte side) {
        this.side = side;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Enclosure)) return false;
        Enclosure other = (Enclosure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.side==null && other.getSide()==null) || 
             (this.side!=null &&
              this.side.equals(other.getSide())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSide() != null) {
            _hashCode += getSide().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Enclosure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "Enclosure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("side");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "Side"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
