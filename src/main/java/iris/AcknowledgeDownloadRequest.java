/**
 * AcknowledgeDownloadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class AcknowledgeDownloadRequest  implements java.io.Serializable {
    private iris.DownloadableContent itemToAcknowledge;

    public AcknowledgeDownloadRequest() {
    }

    public AcknowledgeDownloadRequest(
           iris.DownloadableContent itemToAcknowledge) {
           this.itemToAcknowledge = itemToAcknowledge;
    }


    /**
     * Gets the itemToAcknowledge value for this AcknowledgeDownloadRequest.
     * 
     * @return itemToAcknowledge
     */
    public iris.DownloadableContent getItemToAcknowledge() {
        return itemToAcknowledge;
    }


    /**
     * Sets the itemToAcknowledge value for this AcknowledgeDownloadRequest.
     * 
     * @param itemToAcknowledge
     */
    public void setItemToAcknowledge(iris.DownloadableContent itemToAcknowledge) {
        this.itemToAcknowledge = itemToAcknowledge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcknowledgeDownloadRequest)) return false;
        AcknowledgeDownloadRequest other = (AcknowledgeDownloadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemToAcknowledge==null && other.getItemToAcknowledge()==null) || 
             (this.itemToAcknowledge!=null &&
              this.itemToAcknowledge.equals(other.getItemToAcknowledge())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getItemToAcknowledge() != null) {
            _hashCode += getItemToAcknowledge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcknowledgeDownloadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", ">AcknowledgeDownloadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemToAcknowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ItemToAcknowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "DownloadableContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
