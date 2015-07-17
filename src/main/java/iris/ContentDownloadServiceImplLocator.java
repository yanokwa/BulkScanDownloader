/**
 * ContentDownloadServiceImplLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public class ContentDownloadServiceImplLocator extends org.apache.axis.client.Service implements iris.ContentDownloadServiceImpl {

    public ContentDownloadServiceImplLocator() {
    }


    public ContentDownloadServiceImplLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContentDownloadServiceImplLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ContentDownloadService
    private java.lang.String BasicHttpBinding_ContentDownloadService_address = "https://localhost:1905/Services/ScanDownload2";

    public java.lang.String getBasicHttpBinding_ContentDownloadServiceAddress() {
        return BasicHttpBinding_ContentDownloadService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ContentDownloadServiceWSDDServiceName = "BasicHttpBinding_ContentDownloadService";

    public java.lang.String getBasicHttpBinding_ContentDownloadServiceWSDDServiceName() {
        return BasicHttpBinding_ContentDownloadServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ContentDownloadServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ContentDownloadServiceWSDDServiceName = name;
    }

    public iris.ContentDownloadService getBasicHttpBinding_ContentDownloadService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ContentDownloadService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ContentDownloadService(endpoint);
    }

    public iris.ContentDownloadService getBasicHttpBinding_ContentDownloadService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iris.BasicHttpBinding_ContentDownloadServiceStub _stub = new iris.BasicHttpBinding_ContentDownloadServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ContentDownloadServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ContentDownloadServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ContentDownloadService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iris.ContentDownloadService.class.isAssignableFrom(serviceEndpointInterface)) {
                iris.BasicHttpBinding_ContentDownloadServiceStub _stub = new iris.BasicHttpBinding_ContentDownloadServiceStub(new java.net.URL(BasicHttpBinding_ContentDownloadService_address), this);
                _stub.setPortName(getBasicHttpBinding_ContentDownloadServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_ContentDownloadService".equals(inputPortName)) {
            return getBasicHttpBinding_ContentDownloadService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("uri:iris", "ContentDownloadServiceImpl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("uri:iris", "BasicHttpBinding_ContentDownloadService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ContentDownloadService".equals(portName)) {
            setBasicHttpBinding_ContentDownloadServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
