/**
 * BasicHttpBinding_ContentDownloadServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class BasicHttpBinding_ContentDownloadServiceStub extends org.apache.axis.client.Stub implements iris.ContentDownloadService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryDownloadableContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("uri:iris", "QueryDownloadableContentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("uri:iris", ">QueryDownloadableContentRequest"), iris.QueryDownloadableContentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("uri:iris", ">QueryDownloadableContentResponse"));
        oper.setReturnClass(iris.QueryDownloadableContentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("uri:iris", "QueryDownloadableContentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"),
                      "iris.AuthFault",
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FetchDownloadableContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("uri:iris", "FetchDownloadableContentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("uri:iris", ">FetchDownloadableContentRequest"), iris.FetchDownloadableContentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("uri:iris", ">FetchDownloadableContentResponse"));
        oper.setReturnClass(iris.FetchDownloadableContentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("uri:iris", "FetchDownloadableContentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"),
                      "iris.AuthFault",
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("uri:iris", "ContentDownloadImageStoreFault"),
                      "iris.ContentDownloadImageStoreFault",
                      new javax.xml.namespace.QName("uri:iris", "ContentDownloadImageStoreFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcknowledgeDownload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("uri:iris", "AcknowledgeDownloadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("uri:iris", ">AcknowledgeDownloadRequest"), iris.AcknowledgeDownloadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("uri:iris", ">AcknowledgeDownloadResponse"));
        oper.setReturnClass(iris.AcknowledgeDownloadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("uri:iris", "AcknowledgeDownloadResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RecycleDownloadedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("uri:iris", "RecycleDownloadedItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("uri:iris", ">RecycleDownloadedItemRequest"), iris.RecycleDownloadedItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("uri:iris", ">RecycleDownloadedItemResponse"));
        oper.setReturnClass(iris.RecycleDownloadedItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("uri:iris", "RecycleDownloadedItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"),
                      "iris.AuthFault",
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ShredDownloadedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("uri:iris", "ShredDownloadedItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("uri:iris", ">ShredDownloadedItemRequest"), iris.ShredDownloadedItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("uri:iris", ">ShredDownloadedItemResponse"));
        oper.setReturnClass(iris.ShredDownloadedItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("uri:iris", "ShredDownloadedItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"),
                      "iris.AuthFault",
                      new javax.xml.namespace.QName("uri:iris", "AuthFault"), 
                      true
                     ));
        _operations[4] = oper;

    }

    public BasicHttpBinding_ContentDownloadServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_ContentDownloadServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_ContentDownloadServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", ">ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD>KeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD");
            cachedSerQNames.add(qName);
            cls = iris.containers.ArrayDictionary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD");
            cachedSerQNames.add(qName);
            cls = iris.containers.ArrayDictionary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", ">ArrayOfKeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD>KeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfLicensePlateArrayOfDownloadableContentNALaQ8RD");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("uri:iris", ">AcknowledgeDownloadRequest");
            cachedSerQNames.add(qName);
            cls = iris.AcknowledgeDownloadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">AcknowledgeDownloadResponse");
            cachedSerQNames.add(qName);
            cls = iris.AcknowledgeDownloadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">FetchDownloadableContentRequest");
            cachedSerQNames.add(qName);
            cls = iris.FetchDownloadableContentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">FetchDownloadableContentResponse");
            cachedSerQNames.add(qName);
            cls = iris.FetchDownloadableContentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">QueryDownloadableContentRequest");
            cachedSerQNames.add(qName);
            cls = iris.QueryDownloadableContentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">QueryDownloadableContentResponse");
            cachedSerQNames.add(qName);
            cls = iris.QueryDownloadableContentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">RecycleDownloadedItemRequest");
            cachedSerQNames.add(qName);
            cls = iris.RecycleDownloadedItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">RecycleDownloadedItemResponse");
            cachedSerQNames.add(qName);
            cls = iris.RecycleDownloadedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">ShredDownloadedItemRequest");
            cachedSerQNames.add(qName);
            cls = iris.ShredDownloadedItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", ">ShredDownloadedItemResponse");
            cachedSerQNames.add(qName);
            cls = iris.ShredDownloadedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "ArrayOfDownloadableContent");
            cachedSerQNames.add(qName);
            cls = iris.DownloadableContent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("uri:iris", "DownloadableContent");
            qName2 = new javax.xml.namespace.QName("uri:iris", "DownloadableContent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("uri:iris", "ArrayOfVItemID");
            cachedSerQNames.add(qName);
            cls = iris.VItemID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("uri:iris", "VItemID");
            qName2 = new javax.xml.namespace.QName("uri:iris", "VItemID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("uri:iris", "AuthFault");
            cachedSerQNames.add(qName);
            cls = iris.AuthFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "AuthFaultReason");
            cachedSerQNames.add(qName);
            cls = iris.AuthFaultReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "AutoOperators");
            cachedSerQNames.add(qName);
            cls = iris.AutoOperators.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "ContentDownloadImageStoreFault");
            cachedSerQNames.add(qName);
            cls = iris.ContentDownloadImageStoreFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "DownloadableContent");
            cachedSerQNames.add(qName);
            cls = iris.DownloadableContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "Enclosure");
            cachedSerQNames.add(qName);
            cls = iris.Enclosure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "ExtractStatus");
            cachedSerQNames.add(qName);
            cls = iris.ExtractStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "FileStoreContentType");
            cachedSerQNames.add(qName);
            cls = iris.FileStoreContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "IdentityID");
            cachedSerQNames.add(qName);
            cls = iris.IdentityID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "IrisIdentity");
            cachedSerQNames.add(qName);
            cls = iris.IrisIdentity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "IrisIdentityType");
            cachedSerQNames.add(qName);
            cls = iris.IrisIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "IrisUserID");
            cachedSerQNames.add(qName);
            cls = iris.IrisUserID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "LicensePlate");
            cachedSerQNames.add(qName);
            cls = iris.LicensePlate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "MailboxID");
            cachedSerQNames.add(qName);
            cls = iris.MailboxID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "OperationType");
            cachedSerQNames.add(qName);
            cls = iris.OperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "OpRequestBillingStatus");
            cachedSerQNames.add(qName);
            cls = iris.OpRequestBillingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "OpsUserID");
            cachedSerQNames.add(qName);
            cls = iris.OpsUserID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "PItemStatus");
            cachedSerQNames.add(qName);
            cls = iris.PItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("uri:iris", "ScannedContent");
            cachedSerQNames.add(qName);
            cls = iris.ScannedContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "SimpleIDOflong");
            cachedSerQNames.add(qName);
            cls = iris.SimpleIDOflong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("uri:iris", "VItemID");
            cachedSerQNames.add(qName);
            cls = iris.VItemID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public iris.QueryDownloadableContentResponse queryDownloadableContent(iris.QueryDownloadableContentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("uri:iris/ContentDownloadService/QueryDownloadableContent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryDownloadableContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iris.QueryDownloadableContentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (iris.QueryDownloadableContentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, iris.QueryDownloadableContentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof iris.AuthFault) {
              throw (iris.AuthFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public iris.FetchDownloadableContentResponse fetchDownloadableContent(iris.FetchDownloadableContentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("uri:iris/ContentDownloadService/FetchDownloadableContent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FetchDownloadableContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iris.FetchDownloadableContentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (iris.FetchDownloadableContentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, iris.FetchDownloadableContentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof iris.AuthFault) {
              throw (iris.AuthFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof iris.ContentDownloadImageStoreFault) {
              throw (iris.ContentDownloadImageStoreFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public iris.AcknowledgeDownloadResponse acknowledgeDownload(iris.AcknowledgeDownloadRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("uri:iris/ContentDownloadService/AcknowledgeDownload");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AcknowledgeDownload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iris.AcknowledgeDownloadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (iris.AcknowledgeDownloadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, iris.AcknowledgeDownloadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public iris.RecycleDownloadedItemResponse recycleDownloadedItem(iris.RecycleDownloadedItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("uri:iris/ContentDownloadService/RecycleDownloadedItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RecycleDownloadedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iris.RecycleDownloadedItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (iris.RecycleDownloadedItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, iris.RecycleDownloadedItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof iris.AuthFault) {
              throw (iris.AuthFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public iris.ShredDownloadedItemResponse shredDownloadedItem(iris.ShredDownloadedItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("uri:iris/ContentDownloadService/ShredDownloadedItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ShredDownloadedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iris.ShredDownloadedItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (iris.ShredDownloadedItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, iris.ShredDownloadedItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof iris.AuthFault) {
              throw (iris.AuthFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
