/**
 * QueryDownloadableContentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class QueryDownloadableContentResponse  implements java.io.Serializable {
    private java.lang.Integer itemCount;

    private iris.containers.ArrayDictionary[] queryResult;

    public QueryDownloadableContentResponse() {
    }

    public QueryDownloadableContentResponse(
           java.lang.Integer itemCount,
           iris.containers.ArrayDictionary[] queryResult) {
           this.itemCount = itemCount;
           this.queryResult = queryResult;
    }


    /**
     * Gets the itemCount value for this QueryDownloadableContentResponse.
     * 
     * @return itemCount
     */
    public java.lang.Integer getItemCount() {
        return itemCount;
    }


    /**
     * Sets the itemCount value for this QueryDownloadableContentResponse.
     * 
     * @param itemCount
     */
    public void setItemCount(java.lang.Integer itemCount) {
        this.itemCount = itemCount;
    }


    /**
     * Gets the queryResult value for this QueryDownloadableContentResponse.
     * 
     * @return queryResult
     */
    public iris.containers.ArrayDictionary[] getQueryResult() {
        return queryResult;
    }


    /**
     * Sets the queryResult value for this QueryDownloadableContentResponse.
     * 
     * @param queryResult
     */
    public void setQueryResult(iris.containers.ArrayDictionary[] queryResult) {
        this.queryResult = queryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDownloadableContentResponse)) return false;
        QueryDownloadableContentResponse other = (QueryDownloadableContentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemCount==null && other.getItemCount()==null) || 
             (this.itemCount!=null &&
              this.itemCount.equals(other.getItemCount()))) &&
            ((this.queryResult==null && other.getQueryResult()==null) || 
             (this.queryResult!=null &&
              java.util.Arrays.equals(this.queryResult, other.getQueryResult())));
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
        if (getItemCount() != null) {
            _hashCode += getItemCount().hashCode();
        }
        if (getQueryResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDownloadableContentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", ">QueryDownloadableContentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "QueryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", ">ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD>KeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD"));
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
