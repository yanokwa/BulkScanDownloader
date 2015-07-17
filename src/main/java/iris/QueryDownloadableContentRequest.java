/**
 * QueryDownloadableContentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class QueryDownloadableContentRequest  implements java.io.Serializable {
    private java.lang.Boolean allEnvelopeSides;

    private java.lang.Boolean contentScans;

    private java.lang.Boolean envelopeImages;

    private iris.MailboxID mailboxID;

    public QueryDownloadableContentRequest() {
    }

    public QueryDownloadableContentRequest(
           java.lang.Boolean allEnvelopeSides,
           java.lang.Boolean contentScans,
           java.lang.Boolean envelopeImages,
           iris.MailboxID mailboxID) {
           this.allEnvelopeSides = allEnvelopeSides;
           this.contentScans = contentScans;
           this.envelopeImages = envelopeImages;
           this.mailboxID = mailboxID;
    }


    /**
     * Gets the allEnvelopeSides value for this QueryDownloadableContentRequest.
     * 
     * @return allEnvelopeSides
     */
    public java.lang.Boolean getAllEnvelopeSides() {
        return allEnvelopeSides;
    }


    /**
     * Sets the allEnvelopeSides value for this QueryDownloadableContentRequest.
     * 
     * @param allEnvelopeSides
     */
    public void setAllEnvelopeSides(java.lang.Boolean allEnvelopeSides) {
        this.allEnvelopeSides = allEnvelopeSides;
    }


    /**
     * Gets the contentScans value for this QueryDownloadableContentRequest.
     * 
     * @return contentScans
     */
    public java.lang.Boolean getContentScans() {
        return contentScans;
    }


    /**
     * Sets the contentScans value for this QueryDownloadableContentRequest.
     * 
     * @param contentScans
     */
    public void setContentScans(java.lang.Boolean contentScans) {
        this.contentScans = contentScans;
    }


    /**
     * Gets the envelopeImages value for this QueryDownloadableContentRequest.
     * 
     * @return envelopeImages
     */
    public java.lang.Boolean getEnvelopeImages() {
        return envelopeImages;
    }


    /**
     * Sets the envelopeImages value for this QueryDownloadableContentRequest.
     * 
     * @param envelopeImages
     */
    public void setEnvelopeImages(java.lang.Boolean envelopeImages) {
        this.envelopeImages = envelopeImages;
    }


    /**
     * Gets the mailboxID value for this QueryDownloadableContentRequest.
     * 
     * @return mailboxID
     */
    public iris.MailboxID getMailboxID() {
        return mailboxID;
    }


    /**
     * Sets the mailboxID value for this QueryDownloadableContentRequest.
     * 
     * @param mailboxID
     */
    public void setMailboxID(iris.MailboxID mailboxID) {
        this.mailboxID = mailboxID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDownloadableContentRequest)) return false;
        QueryDownloadableContentRequest other = (QueryDownloadableContentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allEnvelopeSides==null && other.getAllEnvelopeSides()==null) || 
             (this.allEnvelopeSides!=null &&
              this.allEnvelopeSides.equals(other.getAllEnvelopeSides()))) &&
            ((this.contentScans==null && other.getContentScans()==null) || 
             (this.contentScans!=null &&
              this.contentScans.equals(other.getContentScans()))) &&
            ((this.envelopeImages==null && other.getEnvelopeImages()==null) || 
             (this.envelopeImages!=null &&
              this.envelopeImages.equals(other.getEnvelopeImages()))) &&
            ((this.mailboxID==null && other.getMailboxID()==null) || 
             (this.mailboxID!=null &&
              this.mailboxID.equals(other.getMailboxID())));
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
        if (getAllEnvelopeSides() != null) {
            _hashCode += getAllEnvelopeSides().hashCode();
        }
        if (getContentScans() != null) {
            _hashCode += getContentScans().hashCode();
        }
        if (getEnvelopeImages() != null) {
            _hashCode += getEnvelopeImages().hashCode();
        }
        if (getMailboxID() != null) {
            _hashCode += getMailboxID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDownloadableContentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", ">QueryDownloadableContentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allEnvelopeSides");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "AllEnvelopeSides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentScans");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ContentScans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeImages");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "EnvelopeImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailboxID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "MailboxID"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "MailboxID"));
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
