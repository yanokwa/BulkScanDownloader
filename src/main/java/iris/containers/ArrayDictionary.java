/**
 * ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RDKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris.containers;

public class ArrayDictionary  implements java.io.Serializable {
    private iris.LicensePlate key;

    private iris.DownloadableContent[] value;

    public ArrayDictionary() {
    }

    public ArrayDictionary(
           iris.LicensePlate key,
           iris.DownloadableContent[] value) {
           this.key = key;
           this.value = value;
    }


    /**
     * Gets the key value for this ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RDKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD.
     * 
     * @return key
     */
    public iris.LicensePlate getKey() {
        return key;
    }


    /**
     * Sets the key value for this ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RDKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD.
     * 
     * @param key
     */
    public void setKey(iris.LicensePlate key) {
        this.key = key;
    }


    /**
     * Gets the value value for this ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RDKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD.
     * 
     * @return value
     */
    public iris.DownloadableContent[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RDKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD.
     * 
     * @param value
     */
    public void setValue(iris.DownloadableContent[] value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayDictionary)) return false;
        ArrayDictionary other = (ArrayDictionary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayDictionary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", ">ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD>KeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "LicensePlate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "DownloadableContent"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("uri:iris", "DownloadableContent"));
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
