package iris;

public class ContentDownloadServiceProxy implements iris.ContentDownloadService {
  private String _endpoint = null;
  private iris.ContentDownloadService contentDownloadService = null;
  
  public ContentDownloadServiceProxy() {
    _initContentDownloadServiceProxy();
  }
  
  public ContentDownloadServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContentDownloadServiceProxy();
  }
  
  private void _initContentDownloadServiceProxy() {
    try {
      contentDownloadService = (new iris.ContentDownloadServiceImplLocator()).getBasicHttpBinding_ContentDownloadService();
      if (contentDownloadService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contentDownloadService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contentDownloadService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contentDownloadService != null)
      ((javax.xml.rpc.Stub)contentDownloadService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iris.ContentDownloadService getContentDownloadService() {
    if (contentDownloadService == null)
      _initContentDownloadServiceProxy();
    return contentDownloadService;
  }
  
  public iris.QueryDownloadableContentResponse queryDownloadableContent(iris.QueryDownloadableContentRequest parameters) throws java.rmi.RemoteException {
    if (contentDownloadService == null)
      _initContentDownloadServiceProxy();
    return contentDownloadService.queryDownloadableContent(parameters);
  }
  
  public iris.FetchDownloadableContentResponse fetchDownloadableContent(iris.FetchDownloadableContentRequest parameters) throws java.rmi.RemoteException {
    if (contentDownloadService == null)
      _initContentDownloadServiceProxy();
    return contentDownloadService.fetchDownloadableContent(parameters);
  }
  
  public iris.AcknowledgeDownloadResponse acknowledgeDownload(iris.AcknowledgeDownloadRequest parameters) throws java.rmi.RemoteException{
    if (contentDownloadService == null)
      _initContentDownloadServiceProxy();
    return contentDownloadService.acknowledgeDownload(parameters);
  }
  
  public iris.RecycleDownloadedItemResponse recycleDownloadedItem(iris.RecycleDownloadedItemRequest parameters) throws java.rmi.RemoteException {
    if (contentDownloadService == null)
      _initContentDownloadServiceProxy();
    return contentDownloadService.recycleDownloadedItem(parameters);
  }
  
  public iris.ShredDownloadedItemResponse shredDownloadedItem(iris.ShredDownloadedItemRequest parameters) throws java.rmi.RemoteException {
    if (contentDownloadService == null)
      _initContentDownloadServiceProxy();
    return contentDownloadService.shredDownloadedItem(parameters);
  }
  
  
}