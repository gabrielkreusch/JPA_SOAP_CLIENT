
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
@WebServiceClient(name = "ParticipanteWS", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/AV03_SERVICES/ParticipanteWS?wsdl")
public class ParticipanteWS_Service
    extends Service
{

    private final static URL PARTICIPANTEWS_WSDL_LOCATION;
    private final static WebServiceException PARTICIPANTEWS_EXCEPTION;
    private final static QName PARTICIPANTEWS_QNAME = new QName("http://services/", "ParticipanteWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AV03_SERVICES/ParticipanteWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PARTICIPANTEWS_WSDL_LOCATION = url;
        PARTICIPANTEWS_EXCEPTION = e;
    }

    public ParticipanteWS_Service() {
        super(__getWsdlLocation(), PARTICIPANTEWS_QNAME);
    }

    public ParticipanteWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PARTICIPANTEWS_QNAME, features);
    }

    public ParticipanteWS_Service(URL wsdlLocation) {
        super(wsdlLocation, PARTICIPANTEWS_QNAME);
    }

    public ParticipanteWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PARTICIPANTEWS_QNAME, features);
    }

    public ParticipanteWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParticipanteWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ParticipanteWS
     */
    @WebEndpoint(name = "ParticipanteWSPort")
    public ParticipanteWS getParticipanteWSPort() {
        return super.getPort(new QName("http://services/", "ParticipanteWSPort"), ParticipanteWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParticipanteWS
     */
    @WebEndpoint(name = "ParticipanteWSPort")
    public ParticipanteWS getParticipanteWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "ParticipanteWSPort"), ParticipanteWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PARTICIPANTEWS_EXCEPTION!= null) {
            throw PARTICIPANTEWS_EXCEPTION;
        }
        return PARTICIPANTEWS_WSDL_LOCATION;
    }

}
