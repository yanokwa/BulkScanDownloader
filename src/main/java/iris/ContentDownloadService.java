/**
 * ContentDownloadService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iris;

public interface ContentDownloadService extends java.rmi.Remote {
    iris.QueryDownloadableContentResponse queryDownloadableContent(iris.QueryDownloadableContentRequest parameters) throws java.rmi.RemoteException;
    iris.FetchDownloadableContentResponse fetchDownloadableContent(iris.FetchDownloadableContentRequest parameters) throws java.rmi.RemoteException;
    iris.AcknowledgeDownloadResponse acknowledgeDownload(iris.AcknowledgeDownloadRequest parameters) throws java.rmi.RemoteException;
    iris.RecycleDownloadedItemResponse recycleDownloadedItem(iris.RecycleDownloadedItemRequest parameters) throws java.rmi.RemoteException;
    iris.ShredDownloadedItemResponse shredDownloadedItem(iris.ShredDownloadedItemRequest parameters) throws java.rmi.RemoteException;
}
