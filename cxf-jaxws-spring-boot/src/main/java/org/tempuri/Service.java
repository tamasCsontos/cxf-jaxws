package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.4.1
 * 2020-11-19T18:01:35.873+01:00
 * Generated source version: 3.4.1
 *
 */
@WebServiceClient(name = "Service",
                  wsdlLocation = "file:/c:/test/UgyfelhivoService_v1_Proxy_Service_WSDL.wsdl",
                  targetNamespace = "http://tempuri.org/")
public class Service extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Service");
    public final static QName BasicHttpBindingIService = new QName("http://tempuri.org/", "BasicHttpBinding_IService");
    static {
        URL url = null;
        try {
            url = new URL("file:/c:/test/UgyfelhivoService_v1_Proxy_Service_WSDL.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/c:/test/UgyfelhivoService_v1_Proxy_Service_WSDL.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "BasicHttpBinding_IService")
    public IService getBasicHttpBindingIService() {
        return super.getPort(BasicHttpBindingIService, IService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "BasicHttpBinding_IService")
    public IService getBasicHttpBindingIService(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIService, IService.class, features);
    }

}
