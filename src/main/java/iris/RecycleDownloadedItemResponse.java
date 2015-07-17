/**
 * RecycleDownloadedItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class RecycleDownloadedItemResponse  implements java.io.Serializable {
    private iris.OpRequestBillingStatus billingStatus;

    private java.lang.Boolean shouldRetry;

    public RecycleDownloadedItemResponse() {
    }

    public RecycleDownloadedItemResponse(
           iris.OpRequestBillingStatus billingStatus,
           java.lang.Boolean shouldRetry) {
           this.billingStatus = billingStatus;
           this.shouldRetry = shouldRetry;
    }


    /**
     * Gets the billingStatus value for this RecycleDownloadedItemResponse.
     * 
     * @return billingStatus
     */
    public iris.OpRequestBillingStatus getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this RecycleDownloadedItemResponse.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(iris.OpRequestBillingStatus billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the shouldRetry value for this RecycleDownloadedItemResponse.
     * 
     * @return shouldRetry
     */
    public java.lang.Boolean getShouldRetry() {
        return shouldRetry;
    }


    /**
     * Sets the shouldRetry value for this RecycleDownloadedItemResponse.
     * 
     * @param shouldRetry
     */
    public void setShouldRetry(java.lang.Boolean shouldRetry) {
        this.shouldRetry = shouldRetry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecycleDownloadedItemResponse)) return false;
        RecycleDownloadedItemResponse other = (RecycleDownloadedItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
            ((this.shouldRetry==null && other.getShouldRetry()==null) || 
             (this.shouldRetry!=null &&
              this.shouldRetry.equals(other.getShouldRetry())));
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
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        if (getShouldRetry() != null) {
            _hashCode += getShouldRetry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecycleDownloadedItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", ">RecycleDownloadedItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "BillingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "OpRequestBillingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shouldRetry");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ShouldRetry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
