
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlterarLocal_QNAME = new QName("http://services/", "alterarLocal");
    private final static QName _ExcluirLocal_QNAME = new QName("http://services/", "excluirLocal");
    private final static QName _ListarLocais_QNAME = new QName("http://services/", "listarLocais");
    private final static QName _ListarLocaisResponse_QNAME = new QName("http://services/", "listarLocaisResponse");
    private final static QName _LocalPorID_QNAME = new QName("http://services/", "localPorID");
    private final static QName _CriarLocalResponse_QNAME = new QName("http://services/", "criarLocalResponse");
    private final static QName _CriarLocal_QNAME = new QName("http://services/", "criarLocal");
    private final static QName _ExcluirLocalResponse_QNAME = new QName("http://services/", "excluirLocalResponse");
    private final static QName _LocalPorIDResponse_QNAME = new QName("http://services/", "localPorIDResponse");
    private final static QName _AlterarLocalResponse_QNAME = new QName("http://services/", "alterarLocalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExcluirLocalResponse }
     * 
     */
    public ExcluirLocalResponse createExcluirLocalResponse() {
        return new ExcluirLocalResponse();
    }

    /**
     * Create an instance of {@link CriarLocal }
     * 
     */
    public CriarLocal createCriarLocal() {
        return new CriarLocal();
    }

    /**
     * Create an instance of {@link LocalPorIDResponse }
     * 
     */
    public LocalPorIDResponse createLocalPorIDResponse() {
        return new LocalPorIDResponse();
    }

    /**
     * Create an instance of {@link AlterarLocalResponse }
     * 
     */
    public AlterarLocalResponse createAlterarLocalResponse() {
        return new AlterarLocalResponse();
    }

    /**
     * Create an instance of {@link ListarLocais }
     * 
     */
    public ListarLocais createListarLocais() {
        return new ListarLocais();
    }

    /**
     * Create an instance of {@link AlterarLocal }
     * 
     */
    public AlterarLocal createAlterarLocal() {
        return new AlterarLocal();
    }

    /**
     * Create an instance of {@link ExcluirLocal }
     * 
     */
    public ExcluirLocal createExcluirLocal() {
        return new ExcluirLocal();
    }

    /**
     * Create an instance of {@link LocalPorID }
     * 
     */
    public LocalPorID createLocalPorID() {
        return new LocalPorID();
    }

    /**
     * Create an instance of {@link CriarLocalResponse }
     * 
     */
    public CriarLocalResponse createCriarLocalResponse() {
        return new CriarLocalResponse();
    }

    /**
     * Create an instance of {@link ListarLocaisResponse }
     * 
     */
    public ListarLocaisResponse createListarLocaisResponse() {
        return new ListarLocaisResponse();
    }

    /**
     * Create an instance of {@link Participante }
     * 
     */
    public Participante createParticipante() {
        return new Participante();
    }

    /**
     * Create an instance of {@link Local }
     * 
     */
    public Local createLocal() {
        return new Local();
    }

    /**
     * Create an instance of {@link Compromisso }
     * 
     */
    public Compromisso createCompromisso() {
        return new Compromisso();
    }

    /**
     * Create an instance of {@link Contato }
     * 
     */
    public Contato createContato() {
        return new Contato();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alterarLocal")
    public JAXBElement<AlterarLocal> createAlterarLocal(AlterarLocal value) {
        return new JAXBElement<AlterarLocal>(_AlterarLocal_QNAME, AlterarLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "excluirLocal")
    public JAXBElement<ExcluirLocal> createExcluirLocal(ExcluirLocal value) {
        return new JAXBElement<ExcluirLocal>(_ExcluirLocal_QNAME, ExcluirLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLocais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarLocais")
    public JAXBElement<ListarLocais> createListarLocais(ListarLocais value) {
        return new JAXBElement<ListarLocais>(_ListarLocais_QNAME, ListarLocais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLocaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarLocaisResponse")
    public JAXBElement<ListarLocaisResponse> createListarLocaisResponse(ListarLocaisResponse value) {
        return new JAXBElement<ListarLocaisResponse>(_ListarLocaisResponse_QNAME, ListarLocaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "localPorID")
    public JAXBElement<LocalPorID> createLocalPorID(LocalPorID value) {
        return new JAXBElement<LocalPorID>(_LocalPorID_QNAME, LocalPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarLocalResponse")
    public JAXBElement<CriarLocalResponse> createCriarLocalResponse(CriarLocalResponse value) {
        return new JAXBElement<CriarLocalResponse>(_CriarLocalResponse_QNAME, CriarLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarLocal")
    public JAXBElement<CriarLocal> createCriarLocal(CriarLocal value) {
        return new JAXBElement<CriarLocal>(_CriarLocal_QNAME, CriarLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "excluirLocalResponse")
    public JAXBElement<ExcluirLocalResponse> createExcluirLocalResponse(ExcluirLocalResponse value) {
        return new JAXBElement<ExcluirLocalResponse>(_ExcluirLocalResponse_QNAME, ExcluirLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "localPorIDResponse")
    public JAXBElement<LocalPorIDResponse> createLocalPorIDResponse(LocalPorIDResponse value) {
        return new JAXBElement<LocalPorIDResponse>(_LocalPorIDResponse_QNAME, LocalPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alterarLocalResponse")
    public JAXBElement<AlterarLocalResponse> createAlterarLocalResponse(AlterarLocalResponse value) {
        return new JAXBElement<AlterarLocalResponse>(_AlterarLocalResponse_QNAME, AlterarLocalResponse.class, null, value);
    }

}
