
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

    private final static QName _AlterarCompromisso_QNAME = new QName("http://services/", "alterarCompromisso");
    private final static QName _ListarCompromissos_QNAME = new QName("http://services/", "listarCompromissos");
    private final static QName _CompromissoPorContato_QNAME = new QName("http://services/", "compromissoPorContato");
    private final static QName _CompromissoPorLocalResponse_QNAME = new QName("http://services/", "compromissoPorLocalResponse");
    private final static QName _ExcluirCompromisso_QNAME = new QName("http://services/", "excluirCompromisso");
    private final static QName _CompromissoPorIDResponse_QNAME = new QName("http://services/", "compromissoPorIDResponse");
    private final static QName _CriarCompromissoResponse_QNAME = new QName("http://services/", "criarCompromissoResponse");
    private final static QName _ExcluirCompromissoResponse_QNAME = new QName("http://services/", "excluirCompromissoResponse");
    private final static QName _CriarCompromisso_QNAME = new QName("http://services/", "criarCompromisso");
    private final static QName _AlterarCompromissoResponse_QNAME = new QName("http://services/", "alterarCompromissoResponse");
    private final static QName _ListarCompromissosResponse_QNAME = new QName("http://services/", "listarCompromissosResponse");
    private final static QName _CompromissoPorContatoResponse_QNAME = new QName("http://services/", "compromissoPorContatoResponse");
    private final static QName _CompromissoPorLocal_QNAME = new QName("http://services/", "compromissoPorLocal");
    private final static QName _CompromissoPorID_QNAME = new QName("http://services/", "compromissoPorID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompromissoPorID }
     * 
     */
    public CompromissoPorID createCompromissoPorID() {
        return new CompromissoPorID();
    }

    /**
     * Create an instance of {@link CompromissoPorContatoResponse }
     * 
     */
    public CompromissoPorContatoResponse createCompromissoPorContatoResponse() {
        return new CompromissoPorContatoResponse();
    }

    /**
     * Create an instance of {@link CompromissoPorLocal }
     * 
     */
    public CompromissoPorLocal createCompromissoPorLocal() {
        return new CompromissoPorLocal();
    }

    /**
     * Create an instance of {@link CriarCompromisso }
     * 
     */
    public CriarCompromisso createCriarCompromisso() {
        return new CriarCompromisso();
    }

    /**
     * Create an instance of {@link AlterarCompromissoResponse }
     * 
     */
    public AlterarCompromissoResponse createAlterarCompromissoResponse() {
        return new AlterarCompromissoResponse();
    }

    /**
     * Create an instance of {@link ListarCompromissosResponse }
     * 
     */
    public ListarCompromissosResponse createListarCompromissosResponse() {
        return new ListarCompromissosResponse();
    }

    /**
     * Create an instance of {@link CriarCompromissoResponse }
     * 
     */
    public CriarCompromissoResponse createCriarCompromissoResponse() {
        return new CriarCompromissoResponse();
    }

    /**
     * Create an instance of {@link ExcluirCompromissoResponse }
     * 
     */
    public ExcluirCompromissoResponse createExcluirCompromissoResponse() {
        return new ExcluirCompromissoResponse();
    }

    /**
     * Create an instance of {@link AlterarCompromisso }
     * 
     */
    public AlterarCompromisso createAlterarCompromisso() {
        return new AlterarCompromisso();
    }

    /**
     * Create an instance of {@link ListarCompromissos }
     * 
     */
    public ListarCompromissos createListarCompromissos() {
        return new ListarCompromissos();
    }

    /**
     * Create an instance of {@link ExcluirCompromisso }
     * 
     */
    public ExcluirCompromisso createExcluirCompromisso() {
        return new ExcluirCompromisso();
    }

    /**
     * Create an instance of {@link CompromissoPorIDResponse }
     * 
     */
    public CompromissoPorIDResponse createCompromissoPorIDResponse() {
        return new CompromissoPorIDResponse();
    }

    /**
     * Create an instance of {@link CompromissoPorContato }
     * 
     */
    public CompromissoPorContato createCompromissoPorContato() {
        return new CompromissoPorContato();
    }

    /**
     * Create an instance of {@link CompromissoPorLocalResponse }
     * 
     */
    public CompromissoPorLocalResponse createCompromissoPorLocalResponse() {
        return new CompromissoPorLocalResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarCompromisso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alterarCompromisso")
    public JAXBElement<AlterarCompromisso> createAlterarCompromisso(AlterarCompromisso value) {
        return new JAXBElement<AlterarCompromisso>(_AlterarCompromisso_QNAME, AlterarCompromisso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCompromissos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarCompromissos")
    public JAXBElement<ListarCompromissos> createListarCompromissos(ListarCompromissos value) {
        return new JAXBElement<ListarCompromissos>(_ListarCompromissos_QNAME, ListarCompromissos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompromissoPorContato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compromissoPorContato")
    public JAXBElement<CompromissoPorContato> createCompromissoPorContato(CompromissoPorContato value) {
        return new JAXBElement<CompromissoPorContato>(_CompromissoPorContato_QNAME, CompromissoPorContato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompromissoPorLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compromissoPorLocalResponse")
    public JAXBElement<CompromissoPorLocalResponse> createCompromissoPorLocalResponse(CompromissoPorLocalResponse value) {
        return new JAXBElement<CompromissoPorLocalResponse>(_CompromissoPorLocalResponse_QNAME, CompromissoPorLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirCompromisso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "excluirCompromisso")
    public JAXBElement<ExcluirCompromisso> createExcluirCompromisso(ExcluirCompromisso value) {
        return new JAXBElement<ExcluirCompromisso>(_ExcluirCompromisso_QNAME, ExcluirCompromisso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompromissoPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compromissoPorIDResponse")
    public JAXBElement<CompromissoPorIDResponse> createCompromissoPorIDResponse(CompromissoPorIDResponse value) {
        return new JAXBElement<CompromissoPorIDResponse>(_CompromissoPorIDResponse_QNAME, CompromissoPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarCompromissoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarCompromissoResponse")
    public JAXBElement<CriarCompromissoResponse> createCriarCompromissoResponse(CriarCompromissoResponse value) {
        return new JAXBElement<CriarCompromissoResponse>(_CriarCompromissoResponse_QNAME, CriarCompromissoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirCompromissoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "excluirCompromissoResponse")
    public JAXBElement<ExcluirCompromissoResponse> createExcluirCompromissoResponse(ExcluirCompromissoResponse value) {
        return new JAXBElement<ExcluirCompromissoResponse>(_ExcluirCompromissoResponse_QNAME, ExcluirCompromissoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarCompromisso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarCompromisso")
    public JAXBElement<CriarCompromisso> createCriarCompromisso(CriarCompromisso value) {
        return new JAXBElement<CriarCompromisso>(_CriarCompromisso_QNAME, CriarCompromisso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarCompromissoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alterarCompromissoResponse")
    public JAXBElement<AlterarCompromissoResponse> createAlterarCompromissoResponse(AlterarCompromissoResponse value) {
        return new JAXBElement<AlterarCompromissoResponse>(_AlterarCompromissoResponse_QNAME, AlterarCompromissoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCompromissosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarCompromissosResponse")
    public JAXBElement<ListarCompromissosResponse> createListarCompromissosResponse(ListarCompromissosResponse value) {
        return new JAXBElement<ListarCompromissosResponse>(_ListarCompromissosResponse_QNAME, ListarCompromissosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompromissoPorContatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compromissoPorContatoResponse")
    public JAXBElement<CompromissoPorContatoResponse> createCompromissoPorContatoResponse(CompromissoPorContatoResponse value) {
        return new JAXBElement<CompromissoPorContatoResponse>(_CompromissoPorContatoResponse_QNAME, CompromissoPorContatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompromissoPorLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compromissoPorLocal")
    public JAXBElement<CompromissoPorLocal> createCompromissoPorLocal(CompromissoPorLocal value) {
        return new JAXBElement<CompromissoPorLocal>(_CompromissoPorLocal_QNAME, CompromissoPorLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompromissoPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compromissoPorID")
    public JAXBElement<CompromissoPorID> createCompromissoPorID(CompromissoPorID value) {
        return new JAXBElement<CompromissoPorID>(_CompromissoPorID_QNAME, CompromissoPorID.class, null, value);
    }

}
