/**
 * IrisIdentity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class IrisIdentity  implements java.io.Serializable {
    private java.lang.String displayName;

    private java.lang.String externalID;

    private iris.IrisIdentityType identityType;

    private iris.IdentityID irisIdentityID;

    private iris.IrisUserID irisUserID;

    private java.lang.String name;

    private iris.OpsUserID opsUserID;

    public IrisIdentity() {
    }

    public IrisIdentity(
           java.lang.String displayName,
           java.lang.String externalID,
           iris.IrisIdentityType identityType,
           iris.IdentityID irisIdentityID,
           iris.IrisUserID irisUserID,
           java.lang.String name,
           iris.OpsUserID opsUserID) {
           this.displayName = displayName;
           this.externalID = externalID;
           this.identityType = identityType;
           this.irisIdentityID = irisIdentityID;
           this.irisUserID = irisUserID;
           this.name = name;
           this.opsUserID = opsUserID;
    }


    /**
     * Gets the displayName value for this IrisIdentity.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this IrisIdentity.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the externalID value for this IrisIdentity.
     * 
     * @return externalID
     */
    public java.lang.String getExternalID() {
        return externalID;
    }


    /**
     * Sets the externalID value for this IrisIdentity.
     * 
     * @param externalID
     */
    public void setExternalID(java.lang.String externalID) {
        this.externalID = externalID;
    }


    /**
     * Gets the identityType value for this IrisIdentity.
     * 
     * @return identityType
     */
    public iris.IrisIdentityType getIdentityType() {
        return identityType;
    }


    /**
     * Sets the identityType value for this IrisIdentity.
     * 
     * @param identityType
     */
    public void setIdentityType(iris.IrisIdentityType identityType) {
        this.identityType = identityType;
    }


    /**
     * Gets the irisIdentityID value for this IrisIdentity.
     * 
     * @return irisIdentityID
     */
    public iris.IdentityID getIrisIdentityID() {
        return irisIdentityID;
    }


    /**
     * Sets the irisIdentityID value for this IrisIdentity.
     * 
     * @param irisIdentityID
     */
    public void setIrisIdentityID(iris.IdentityID irisIdentityID) {
        this.irisIdentityID = irisIdentityID;
    }


    /**
     * Gets the irisUserID value for this IrisIdentity.
     * 
     * @return irisUserID
     */
    public iris.IrisUserID getIrisUserID() {
        return irisUserID;
    }


    /**
     * Sets the irisUserID value for this IrisIdentity.
     * 
     * @param irisUserID
     */
    public void setIrisUserID(iris.IrisUserID irisUserID) {
        this.irisUserID = irisUserID;
    }


    /**
     * Gets the name value for this IrisIdentity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this IrisIdentity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the opsUserID value for this IrisIdentity.
     * 
     * @return opsUserID
     */
    public iris.OpsUserID getOpsUserID() {
        return opsUserID;
    }


    /**
     * Sets the opsUserID value for this IrisIdentity.
     * 
     * @param opsUserID
     */
    public void setOpsUserID(iris.OpsUserID opsUserID) {
        this.opsUserID = opsUserID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IrisIdentity)) return false;
        IrisIdentity other = (IrisIdentity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.externalID==null && other.getExternalID()==null) || 
             (this.externalID!=null &&
              this.externalID.equals(other.getExternalID()))) &&
            ((this.identityType==null && other.getIdentityType()==null) || 
             (this.identityType!=null &&
              this.identityType.equals(other.getIdentityType()))) &&
            ((this.irisIdentityID==null && other.getIrisIdentityID()==null) || 
             (this.irisIdentityID!=null &&
              this.irisIdentityID.equals(other.getIrisIdentityID()))) &&
            ((this.irisUserID==null && other.getIrisUserID()==null) || 
             (this.irisUserID!=null &&
              this.irisUserID.equals(other.getIrisUserID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opsUserID==null && other.getOpsUserID()==null) || 
             (this.opsUserID!=null &&
              this.opsUserID.equals(other.getOpsUserID())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getExternalID() != null) {
            _hashCode += getExternalID().hashCode();
        }
        if (getIdentityType() != null) {
            _hashCode += getIdentityType().hashCode();
        }
        if (getIrisIdentityID() != null) {
            _hashCode += getIrisIdentityID().hashCode();
        }
        if (getIrisUserID() != null) {
            _hashCode += getIrisUserID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpsUserID() != null) {
            _hashCode += getOpsUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IrisIdentity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "IrisIdentity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ExternalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityType");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "IdentityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "IrisIdentityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisIdentityID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "IrisIdentityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "IdentityID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irisUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "IrisUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "IrisUserID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opsUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "OpsUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "OpsUserID"));
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
