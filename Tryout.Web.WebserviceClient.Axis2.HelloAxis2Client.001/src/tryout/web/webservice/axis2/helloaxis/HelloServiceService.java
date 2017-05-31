/**
 * HelloServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tryout.web.webservice.axis2.helloaxis;

public interface HelloServiceService extends javax.xml.rpc.Service {
    public java.lang.String getHelloServiceAddress();

    public tryout.web.webservice.axis2.helloaxis.HelloService getHelloService() throws javax.xml.rpc.ServiceException;

    public tryout.web.webservice.axis2.helloaxis.HelloService getHelloService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
