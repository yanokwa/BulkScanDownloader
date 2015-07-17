/**
 * FetchDownloadableContentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class FetchDownloadableContentRequest  implements java.io.Serializable {
    private iris.DownloadableContent itemToFetch;

    public FetchDownloadableContentRequest() {
    }

    public FetchDownloadableContentRequest(
           iris.DownloadableContent itemToFetch) {
           this.itemToFetch = itemToFetch;
    }


    /**
     * Gets the itemToFetch value for this FetchDownloadableContentRequest.
     * 
     * @return itemToFetch
     */
    public iris.DownloadableContent getItemToFetch() {
        return itemToFetch;
    }


    /**
     * Sets the itemToFetch value for this FetchDownloadableContentRequest.
     * 
     * @param itemToFetch
     */
    public void setItemToFetch(iris.DownloadableContent itemToFetch) {
        this.itemToFetch = itemToFetch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchDownloadableContentRequest)) return false;
        FetchDownloadableContentRequest other = (FetchDownloadableContentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemToFetch==null && other.getItemToFetch()==null) || 
             (this.itemToFetch!=null &&
              this.itemToFetch.equals(other.getItemToFetch())));
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
        if (getItemToFetch() != null) {
            _hashCode += getItemToFetch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchDownloadableContentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", ">FetchDownloadableContentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemToFetch");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ItemToFetch"));
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
