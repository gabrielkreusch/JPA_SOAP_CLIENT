
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CompromissoWS", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/AV03_SERVICES/CompromissoWS?wsdl")
public class CompromissoWS_Service
    extends Service
{

    private final static URL COMPROMISSOWS_WSDL_LOCATION;
    private final static WebServiceException COMPROMISSOWS_EXCEPTION;
    private final static QName COMPROMISSOWS_QNAME = new QName("http://services/", "CompromissoWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AV03_SERVICES/CompromissoWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPROMISSOWS_WSDL_LOCATION = url;
        COMPROMISSOWS_EXCEPTION = e;
    }

    public CompromissoWS_Service() {
        super(__getWsdlLocation(), COMPROMISSOWS_QNAME);
    }

    public CompromissoWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPROMISSOWS_QNAME, features);
    }

    public CompromissoWS_Service(URL wsdlLocation) {
        super(wsdlLocation, COMPROMISSOWS_QNAME);
    }

    public CompromissoWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPROMISSOWS_QNAME, features);
    }

    public CompromissoWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompromissoWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CompromissoWS
     */
    @WebEndpoint(name = "CompromissoWSPort")
    public CompromissoWS getCompromissoWSPort() {
        return super.getPort(new QName("http://services/", "CompromissoWSPort"), CompromissoWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompromissoWS
     */
    @WebEndpoint(name = "CompromissoWSPort")
    public CompromissoWS getCompromissoWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "CompromissoWSPort"), CompromissoWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPROMISSOWS_EXCEPTION!= null) {
            throw COMPROMISSOWS_EXCEPTION;
        }
        return COMPROMISSOWS_WSDL_LOCATION;
    }

}