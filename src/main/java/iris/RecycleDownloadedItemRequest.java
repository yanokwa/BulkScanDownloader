/**
 * RecycleDownloadedItemRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class RecycleDownloadedItemRequest  implements java.io.Serializable {
    private java.lang.Boolean keepScans;

    private iris.MailboxID mailboxID;

    private iris.VItemID[] VItemIDs;

    public RecycleDownloadedItemRequest() {
    }

    public RecycleDownloadedItemRequest(
           java.lang.Boolean keepScans,
           iris.MailboxID mailboxID,
           iris.VItemID[] VItemIDs) {
           this.keepScans = keepScans;
           this.mailboxID = mailboxID;
           this.VItemIDs = VItemIDs;
    }


    /**
     * Gets the keepScans value for this RecycleDownloadedItemRequest.
     * 
     * @return keepScans
     */
    public java.lang.Boolean getKeepScans() {
        return keepScans;
    }


    /**
     * Sets the keepScans value for this RecycleDownloadedItemRequest.
     * 
     * @param keepScans
     */
    public void setKeepScans(java.lang.Boolean keepScans) {
        this.keepScans = keepScans;
    }


    /**
     * Gets the mailboxID value for this RecycleDownloadedItemRequest.
     * 
     * @return mailboxID
     */
    public iris.MailboxID getMailboxID() {
        return mailboxID;
    }


    /**
     * Sets the mailboxID value for this RecycleDownloadedItemRequest.
     * 
     * @param mailboxID
     */
    public void setMailboxID(iris.MailboxID mailboxID) {
        this.mailboxID = mailboxID;
    }


    /**
     * Gets the VItemIDs value for this RecycleDownloadedItemRequest.
     * 
     * @return VItemIDs
     */
    public iris.VItemID[] getVItemIDs() {
        return VItemIDs;
    }


    /**
     * Sets the VItemIDs value for this RecycleDownloadedItemRequest.
     * 
     * @param VItemIDs
     */
    public void setVItemIDs(iris.VItemID[] VItemIDs) {
        this.VItemIDs = VItemIDs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecycleDownloadedItemRequest)) return false;
        RecycleDownloadedItemRequest other = (RecycleDownloadedItemRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keepScans==null && other.getKeepScans()==null) || 
             (this.keepScans!=null &&
              this.keepScans.equals(other.getKeepScans()))) &&
            ((this.mailboxID==null && other.getMailboxID()==null) || 
             (this.mailboxID!=null &&
              this.mailboxID.equals(other.getMailboxID()))) &&
            ((this.VItemIDs==null && other.getVItemIDs()==null) || 
             (this.VItemIDs!=null &&
              java.util.Arrays.equals(this.VItemIDs, other.getVItemIDs())));
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
        if (getKeepScans() != null) {
            _hashCode += getKeepScans().hashCode();
        }
        if (getMailboxID() != null) {
            _hashCode += getMailboxID().hashCode();
        }
        if (getVItemIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVItemIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVItemIDs(), i);
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
        new org.apache.axis.description.TypeDesc(RecycleDownloadedItemRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", ">RecycleDownloadedItemRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepScans");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "KeepScans"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VItemIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("uri:iris", "VItemIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("uri:iris", "VItemID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("uri:iris", "VItemID"));
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
