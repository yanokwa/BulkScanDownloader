/**
 * DownloadableContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class DownloadableContent  implements java.io.Serializable {
    private iris.FileStoreContentType contentType;

    private java.util.Calendar createDate;

    private iris.ExtractStatus extractStatus;

    private java.lang.String folderName;

    private iris.PItemStatus itemStatus;

    private iris.LicensePlate licensePlate;

    private iris.MailboxID mailboxID;

    private iris.OperationType operation;

    private java.lang.Long sizeBytes;

    private iris.VItemID VItemID;

    public DownloadableContent() {
    }

    public DownloadableContent(
           iris.FileStoreContentType contentType,
           java.util.Calendar createDate,
           iris.ExtractStatus extractStatus,
           java.lang.String folderName,
           iris.PItemStatus itemStatus,
           iris.LicensePlate licensePlate,
           iris.MailboxID mailboxID,
           iris.OperationType operation,
           java.lang.Long sizeBytes,
           iris.VItemID VItemID) {
           this.contentType = contentType;
           this.createDate = createDate;
           this.extractStatus = extractStatus;
           this.folderName = folderName;
           this.itemStatus = itemStatus;
           this.licensePlate = licensePlate;
           this.mailboxID = mailboxID;
           this.operation = operation;
           this.sizeBytes = sizeBytes;
           this.VItemID = VItemID;
    }


    /**
     * Gets the contentType value for this DownloadableContent.
     * 
     * @return contentType
     */
    public iris.FileStoreContentType getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this DownloadableContent.
     * 
     * @param contentType
     */
    public void setContentType(iris.FileStoreContentType contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the createDate value for this DownloadableContent.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this DownloadableContent.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the extractStatus value for this DownloadableContent.
     * 
     * @return extractStatus
     */
    public iris.ExtractStatus getExtractStatus() {
        return extractStatus;
    }


    /**
     * Sets the extractStatus value for this DownloadableContent.
     * 
     * @param extractStatus
     */
    public void setExtractStatus(iris.ExtractStatus extractStatus) {
        this.extractStatus = extractStatus;
    }


    /**
     * Gets the folderName value for this DownloadableContent.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this DownloadableContent.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the itemStatus value for this DownloadableContent.
     * 
     * @return itemStatus
     */
    public iris.PItemStatus getItemStatus() {
        return itemStatus;
    }


    /**
     * Sets the itemStatus value for this DownloadableContent.
     * 
     * @param itemStatus
     */
    public void setItemStatus(iris.PItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }


    /**
     * Gets the licensePlate value for this DownloadableContent.
     * 
     * @return licensePlate
     */
    public iris.LicensePlate getLicensePlate() {
        return licensePlate;
    }


    /**
     * Sets the licensePlate value for this DownloadableContent.
     * 
     * @param licensePlate
     */
    public void setLicensePlate(iris.LicensePlate licensePlate) {
        this.licensePlate = licensePlate;
    }


    /**
     * Gets the mailboxID value for this DownloadableContent.
     * 
     * @return mailboxID
     */
    public iris.MailboxID getMailboxID() {
        return mailboxID;
    }


    /**
     * Sets the mailboxID value for this DownloadableContent.
     * 
     * @param mailboxID
     */
    public void setMailboxID(iris.MailboxID mailboxID) {
        this.mailboxID = mailboxID;
    }


    /**
     * Gets the operation value for this DownloadableContent.
     * 
     * @return operation
     */
    public iris.OperationType getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this DownloadableContent.
     * 
     * @param operation
     */
    public void setOperation(iris.OperationType operation) {
        this.operation = operation;
    }


    /**
     * Gets the sizeBytes value for this DownloadableContent.
     * 
     * @return sizeBytes
     */
    public java.lang.Long getSizeBytes() {
        return sizeBytes;
    }


    /**
     * Sets the sizeBytes value for this DownloadableContent.
     * 
     * @param sizeBytes
     */
    public void setSizeBytes(java.lang.Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }


    /**
     * Gets the VItemID value for this DownloadableContent.
     * 
     * @return VItemID
     */
    public iris.VItemID getVItemID() {
        return VItemID;
    }


    /**
     * Sets the VItemID value for this DownloadableContent.
     * 
     * @param VItemID
     */
    public void setVItemID(iris.VItemID VItemID) {
        this.VItemID = VItemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DownloadableContent)) return false;
        DownloadableContent other = (DownloadableContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.extractStatus==null && other.getExtractStatus()==null) || 
             (this.extractStatus!=null &&
              this.extractStatus.equals(other.getExtractStatus()))) &&
            ((this.folderName==null && other.getFolderName()==null) || 
             (this.folderName!=null &&
              this.folderName.equals(other.getFolderName()))) &&
            ((this.itemStatus==null && other.getItemStatus()==null) || 
             (this.itemStatus!=null &&
              this.itemStatus.equals(other.getItemStatus()))) &&
            ((this.licensePlate==null && other.getLicensePlate()==null) || 
             (this.licensePlate!=null &&
              this.licensePlate.equals(other.getLicensePlate()))) &&
            ((this.mailboxID==null && other.getMailboxID()==null) || 
             (this.mailboxID!=null &&
              this.mailboxID.equals(other.getMailboxID()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.sizeBytes==null && other.getSizeBytes()==null) || 
             (this.sizeBytes!=null &&
              this.sizeBytes.equals(other.getSizeBytes()))) &&
            ((this.VItemID==null && other.getVItemID()==null) || 
             (this.VItemID!=null &&
              this.VItemID.equals(other.getVItemID())));
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
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getExtractStatus() != null) {
            _hashCode += getExtractStatus().hashCode();
        }
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getItemStatus() != null) {
            _hashCode += getItemStatus().hashCode();
        }
        if (getLicensePlate() != null) {
            _hashCode += getLicensePlate().hashCode();
        }
        if (getMailboxID() != null) {
            _hashCode += getMailboxID().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getSizeBytes() != null) {
            _hashCode += getSizeBytes().hashCode();
        }
        if (getVItemID() != null) {
            _hashCode += getVItemID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DownloadableContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "DownloadableContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "FileStoreContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extractStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ExtractStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "ExtractStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderName");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "FolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "ItemStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "PItemStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensePlate");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "LicensePlate"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "LicensePlate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailboxID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "MailboxID"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "MailboxID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "OperationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "SizeBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "VItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "VItemID"));
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
