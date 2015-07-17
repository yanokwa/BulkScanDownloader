/**
 * OperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class OperationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OperationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _Weigh = "Weigh";
    public static final java.lang.String _DeliveryQA = "DeliveryQA";
    public static final java.lang.String _SetAllowClosure = "SetAllowClosure";
    public static final java.lang.String _AccountManage = "AccountManage";
    public static final java.lang.String _AccountStatusChange = "AccountStatusChange";
    public static final java.lang.String _PaymentMethodManage = "PaymentMethodManage";
    public static final java.lang.String _Archive = "Archive";
    public static final java.lang.String _BadImageReturn = "BadImageReturn";
    public static final java.lang.String _Deliver = "Deliver";
    public static final java.lang.String _FundsAdjustment = "FundsAdjustment";
    public static final java.lang.String _SetAccountFraud = "SetAccountFraud";
    public static final java.lang.String _FundsTransfer = "FundsTransfer";
    public static final java.lang.String _GroupManage = "GroupManage";
    public static final java.lang.String _MailboxManage = "MailboxManage";
    public static final java.lang.String _SetFailureOverride = "SetFailureOverride";
    public static final java.lang.String _MonthlyPlanCharge = "MonthlyPlanCharge";
    public static final java.lang.String _RemoteAddressBilling = "RemoteAddressBilling";
    public static final java.lang.String _PreAuthRequest = "PreAuthRequest";
    public static final java.lang.String _RefundRequest = "RefundRequest";
    public static final java.lang.String _ChargeRequest = "ChargeRequest";
    public static final java.lang.String _PieceRejected = "PieceRejected";
    public static final java.lang.String _PieceTransfer = "PieceTransfer";
    public static final java.lang.String _RecipientManage = "RecipientManage";
    public static final java.lang.String _Recycle = "Recycle";
    public static final java.lang.String _RemoteAddressManage = "RemoteAddressManage";
    public static final java.lang.String _ReturnToCarrier = "ReturnToCarrier";
    public static final java.lang.String _ReturnToECM = "ReturnToECM";
    public static final java.lang.String _Scan = "Scan";
    public static final java.lang.String _SetAvsOverride = "SetAvsOverride";
    public static final java.lang.String _ShipSet = "ShipSet";
    public static final java.lang.String _ShipManage = "ShipManage";
    public static final java.lang.String _ShipPiece = "ShipPiece";
    public static final java.lang.String _ShipTransfer = "ShipTransfer";
    public static final java.lang.String _Shred = "Shred";
    public static final java.lang.String _UserClearSecretQA = "UserClearSecretQA";
    public static final java.lang.String _UserManage = "UserManage";
    public static final java.lang.String _UserStatusChange = "UserStatusChange";
    public static final java.lang.String _VItemDelete = "VItemDelete";
    public static final java.lang.String _Induct = "Induct";
    public static final java.lang.String _UserBilling = "UserBilling";
    public static final java.lang.String _VaultAuthOnly = "VaultAuthOnly";
    public static final java.lang.String _VaultPriorAuthCapture = "VaultPriorAuthCapture";
    public static final java.lang.String _VaultCreditUnlinked = "VaultCreditUnlinked";
    public static final java.lang.String _VaultVoid = "VaultVoid";
    public static final java.lang.String _VaultVoidAuthOnly = "VaultVoidAuthOnly";
    public static final java.lang.String _ToMyDeskPiece = "ToMyDeskPiece";
    public static final java.lang.String _ToMyDeskSet = "ToMyDeskSet";
    public static final java.lang.String _BackToInbox = "BackToInbox";
    public static final java.lang.String _ReturnForResolution = "ReturnForResolution";
    public static final java.lang.String _VaultPreAuth = "VaultPreAuth";
    public static final java.lang.String _VaultVoidPreAuth = "VaultVoidPreAuth";
    public static final java.lang.String _Deposit = "Deposit";
    public static final java.lang.String _DepositSurcharge = "DepositSurcharge";
    public static final java.lang.String _DepositAccountManage = "DepositAccountManage";
    public static final java.lang.String _CheckSeparation = "CheckSeparation";
    public static final java.lang.String _DeliverFailed = "DeliverFailed";
    public static final java.lang.String _VItemLink = "VItemLink";
    public static final java.lang.String _Abandoned = "Abandoned";
    public static final java.lang.String _VItemPurge = "VItemPurge";
    public static final java.lang.String _PieceRetentionTransfer = "PieceRetentionTransfer";
    public static final java.lang.String _SuspensionStateChange = "SuspensionStateChange";
    public static final java.lang.String _ClosureStateChange = "ClosureStateChange";
    public static final java.lang.String _TerminationStateChange = "TerminationStateChange";
    public static final java.lang.String _PickUpExtract = "PickUpExtract";
    public static final java.lang.String _AwaitingPickUp = "AwaitingPickUp";
    public static final java.lang.String _PlanManage = "PlanManage";
    public static final java.lang.String _PurgeScans = "PurgeScans";
    public static final java.lang.String _StorageFee = "StorageFee";
    public static final java.lang.String _StorageFeePerItem = "StorageFeePerItem";
    public static final java.lang.String _StorageFeeByWeight = "StorageFeeByWeight";
    public static final java.lang.String _EstimateStorageFee = "EstimateStorageFee";
    public static final java.lang.String _DownloadContent = "DownloadContent";
    public static final java.lang.String _ReImagePiece = "ReImagePiece";
    public static final java.lang.String _PlanFeatureManage = "PlanFeatureManage";
    public static final java.lang.String _PlanFeatureBilling = "PlanFeatureBilling";
    public static final java.lang.String _SetCreditLimit = "SetCreditLimit";
    public static final java.lang.String _SetPendingClosure = "SetPendingClosure";
    public static final java.lang.String _NoDeliverRecorded = "NoDeliverRecorded";
    public static final java.lang.String _PickUpSet = "PickUpSet";
    public static final java.lang.String _OpenAndInduct = "OpenAndInduct";
    public static final java.lang.String _Chargeback = "Chargeback";
    public static final java.lang.String _CategorizedRevenue = "CategorizedRevenue";
    public static final java.lang.String _SendToBillCom = "SendToBillCom";
    public static final java.lang.String _HeavyItem = "HeavyItem";
    public static final java.lang.String _ExpeditedHandling = "ExpeditedHandling";
    public static final java.lang.String _SpecialHandling = "SpecialHandling";
    public static final java.lang.String _SpecialMaterials = "SpecialMaterials";
    public static final java.lang.String _PaymentAdjustment = "PaymentAdjustment";
    public static final java.lang.String _FundsRecovery = "FundsRecovery";
    public static final java.lang.String _ImagePiece = "ImagePiece";
    public static final java.lang.String _SendToCloudStorage = "SendToCloudStorage";
    public static final java.lang.String _ManageCloudStorageAccount = "ManageCloudStorageAccount";
    public static final java.lang.String _RuleTrace = "RuleTrace";
    public static final java.lang.String _RuleActionCanceled = "RuleActionCanceled";
    public static final OperationType Unknown = new OperationType(_Unknown);
    public static final OperationType Weigh = new OperationType(_Weigh);
    public static final OperationType DeliveryQA = new OperationType(_DeliveryQA);
    public static final OperationType SetAllowClosure = new OperationType(_SetAllowClosure);
    public static final OperationType AccountManage = new OperationType(_AccountManage);
    public static final OperationType AccountStatusChange = new OperationType(_AccountStatusChange);
    public static final OperationType PaymentMethodManage = new OperationType(_PaymentMethodManage);
    public static final OperationType Archive = new OperationType(_Archive);
    public static final OperationType BadImageReturn = new OperationType(_BadImageReturn);
    public static final OperationType Deliver = new OperationType(_Deliver);
    public static final OperationType FundsAdjustment = new OperationType(_FundsAdjustment);
    public static final OperationType SetAccountFraud = new OperationType(_SetAccountFraud);
    public static final OperationType FundsTransfer = new OperationType(_FundsTransfer);
    public static final OperationType GroupManage = new OperationType(_GroupManage);
    public static final OperationType MailboxManage = new OperationType(_MailboxManage);
    public static final OperationType SetFailureOverride = new OperationType(_SetFailureOverride);
    public static final OperationType MonthlyPlanCharge = new OperationType(_MonthlyPlanCharge);
    public static final OperationType RemoteAddressBilling = new OperationType(_RemoteAddressBilling);
    public static final OperationType PreAuthRequest = new OperationType(_PreAuthRequest);
    public static final OperationType RefundRequest = new OperationType(_RefundRequest);
    public static final OperationType ChargeRequest = new OperationType(_ChargeRequest);
    public static final OperationType PieceRejected = new OperationType(_PieceRejected);
    public static final OperationType PieceTransfer = new OperationType(_PieceTransfer);
    public static final OperationType RecipientManage = new OperationType(_RecipientManage);
    public static final OperationType Recycle = new OperationType(_Recycle);
    public static final OperationType RemoteAddressManage = new OperationType(_RemoteAddressManage);
    public static final OperationType ReturnToCarrier = new OperationType(_ReturnToCarrier);
    public static final OperationType ReturnToECM = new OperationType(_ReturnToECM);
    public static final OperationType Scan = new OperationType(_Scan);
    public static final OperationType SetAvsOverride = new OperationType(_SetAvsOverride);
    public static final OperationType ShipSet = new OperationType(_ShipSet);
    public static final OperationType ShipManage = new OperationType(_ShipManage);
    public static final OperationType ShipPiece = new OperationType(_ShipPiece);
    public static final OperationType ShipTransfer = new OperationType(_ShipTransfer);
    public static final OperationType Shred = new OperationType(_Shred);
    public static final OperationType UserClearSecretQA = new OperationType(_UserClearSecretQA);
    public static final OperationType UserManage = new OperationType(_UserManage);
    public static final OperationType UserStatusChange = new OperationType(_UserStatusChange);
    public static final OperationType VItemDelete = new OperationType(_VItemDelete);
    public static final OperationType Induct = new OperationType(_Induct);
    public static final OperationType UserBilling = new OperationType(_UserBilling);
    public static final OperationType VaultAuthOnly = new OperationType(_VaultAuthOnly);
    public static final OperationType VaultPriorAuthCapture = new OperationType(_VaultPriorAuthCapture);
    public static final OperationType VaultCreditUnlinked = new OperationType(_VaultCreditUnlinked);
    public static final OperationType VaultVoid = new OperationType(_VaultVoid);
    public static final OperationType VaultVoidAuthOnly = new OperationType(_VaultVoidAuthOnly);
    public static final OperationType ToMyDeskPiece = new OperationType(_ToMyDeskPiece);
    public static final OperationType ToMyDeskSet = new OperationType(_ToMyDeskSet);
    public static final OperationType BackToInbox = new OperationType(_BackToInbox);
    public static final OperationType ReturnForResolution = new OperationType(_ReturnForResolution);
    public static final OperationType VaultPreAuth = new OperationType(_VaultPreAuth);
    public static final OperationType VaultVoidPreAuth = new OperationType(_VaultVoidPreAuth);
    public static final OperationType Deposit = new OperationType(_Deposit);
    public static final OperationType DepositSurcharge = new OperationType(_DepositSurcharge);
    public static final OperationType DepositAccountManage = new OperationType(_DepositAccountManage);
    public static final OperationType CheckSeparation = new OperationType(_CheckSeparation);
    public static final OperationType DeliverFailed = new OperationType(_DeliverFailed);
    public static final OperationType VItemLink = new OperationType(_VItemLink);
    public static final OperationType Abandoned = new OperationType(_Abandoned);
    public static final OperationType VItemPurge = new OperationType(_VItemPurge);
    public static final OperationType PieceRetentionTransfer = new OperationType(_PieceRetentionTransfer);
    public static final OperationType SuspensionStateChange = new OperationType(_SuspensionStateChange);
    public static final OperationType ClosureStateChange = new OperationType(_ClosureStateChange);
    public static final OperationType TerminationStateChange = new OperationType(_TerminationStateChange);
    public static final OperationType PickUpExtract = new OperationType(_PickUpExtract);
    public static final OperationType AwaitingPickUp = new OperationType(_AwaitingPickUp);
    public static final OperationType PlanManage = new OperationType(_PlanManage);
    public static final OperationType PurgeScans = new OperationType(_PurgeScans);
    public static final OperationType StorageFee = new OperationType(_StorageFee);
    public static final OperationType StorageFeePerItem = new OperationType(_StorageFeePerItem);
    public static final OperationType StorageFeeByWeight = new OperationType(_StorageFeeByWeight);
    public static final OperationType EstimateStorageFee = new OperationType(_EstimateStorageFee);
    public static final OperationType DownloadContent = new OperationType(_DownloadContent);
    public static final OperationType ReImagePiece = new OperationType(_ReImagePiece);
    public static final OperationType PlanFeatureManage = new OperationType(_PlanFeatureManage);
    public static final OperationType PlanFeatureBilling = new OperationType(_PlanFeatureBilling);
    public static final OperationType SetCreditLimit = new OperationType(_SetCreditLimit);
    public static final OperationType SetPendingClosure = new OperationType(_SetPendingClosure);
    public static final OperationType NoDeliverRecorded = new OperationType(_NoDeliverRecorded);
    public static final OperationType PickUpSet = new OperationType(_PickUpSet);
    public static final OperationType OpenAndInduct = new OperationType(_OpenAndInduct);
    public static final OperationType Chargeback = new OperationType(_Chargeback);
    public static final OperationType CategorizedRevenue = new OperationType(_CategorizedRevenue);
    public static final OperationType SendToBillCom = new OperationType(_SendToBillCom);
    public static final OperationType HeavyItem = new OperationType(_HeavyItem);
    public static final OperationType ExpeditedHandling = new OperationType(_ExpeditedHandling);
    public static final OperationType SpecialHandling = new OperationType(_SpecialHandling);
    public static final OperationType SpecialMaterials = new OperationType(_SpecialMaterials);
    public static final OperationType PaymentAdjustment = new OperationType(_PaymentAdjustment);
    public static final OperationType FundsRecovery = new OperationType(_FundsRecovery);
    public static final OperationType ImagePiece = new OperationType(_ImagePiece);
    public static final OperationType SendToCloudStorage = new OperationType(_SendToCloudStorage);
    public static final OperationType ManageCloudStorageAccount = new OperationType(_ManageCloudStorageAccount);
    public static final OperationType RuleTrace = new OperationType(_RuleTrace);
    public static final OperationType RuleActionCanceled = new OperationType(_RuleActionCanceled);
    public java.lang.String getValue() { return _value_;}
    public static OperationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OperationType enumeration = (OperationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OperationType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("uri:iris", "OperationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
