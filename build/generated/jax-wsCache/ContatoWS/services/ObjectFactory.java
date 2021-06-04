
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

    private final static QName _ListarContatos_QNAME = new QName("http://services/", "listarContatos");
    private final static QName _ContatoPorNomeResponse_QNAME = new QName("http://services/", "contatoPorNomeResponse");
    private final static QName _ContatoPorNome_QNAME = new QName("http://services/", "contatoPorNome");
    private final static QName _ExcluirContato_QNAME = new QName("http://services/", "excluirContato");
    private final static QName _ContatoPorIDResponse_QNAME = new QName("http://services/", "contatoPorIDResponse");
    private final static QName _CriarContatoResponse_QNAME = new QName("http://services/", "criarContatoResponse");
    private final static QName _AlterarContatoResponse_QNAME = new QName("http://services/", "alterarContatoResponse");
    private final static QName _AlterarContato_QNAME = new QName("http://services/", "alterarContato");
    private final static QName _CriarContato_QNAME = new QName("http://services/", "criarContato");
    private final static QName _ContatoPorID_QNAME = new QName("http://services/", "contatoPorID");
    private final static QName _ExcluirContatoResponse_QNAME = new QName("http://services/", "excluirContatoResponse");
    private final static QName _ListarContatosResponse_QNAME = new QName("http://services/", "listarContatosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExcluirContatoResponse }
     * 
     */
    public ExcluirContatoResponse createExcluirContatoResponse() {
        return new ExcluirContatoResponse();
    }

    /**
     * Create an instance of {@link AlterarContato }
     * 
     */
    public AlterarContato createAlterarContato() {
        return new AlterarContato();
    }

    /**
     * Create an instance of {@link CriarContato }
     * 
     */
    public CriarContato createCriarContato() {
        return new CriarContato();
    }

    /**
     * Create an instance of {@link ContatoPorID }
     * 
     */
    public ContatoPorID createContatoPorID() {
        return new ContatoPorID();
    }

    /**
     * Create an instance of {@link ListarContatosResponse }
     * 
     */
    public ListarContatosResponse createListarContatosResponse() {
        return new ListarContatosResponse();
    }

    /**
     * Create an instance of {@link ContatoPorNomeResponse }
     * 
     */
    public ContatoPorNomeResponse createContatoPorNomeResponse() {
        return new ContatoPorNomeResponse();
    }

    /**
     * Create an instance of {@link ContatoPorNome }
     * 
     */
    public ContatoPorNome createContatoPorNome() {
        return new ContatoPorNome();
    }

    /**
     * Create an instance of {@link ExcluirContato }
     * 
     */
    public ExcluirContato createExcluirContato() {
        return new ExcluirContato();
    }

    /**
     * Create an instance of {@link ListarContatos }
     * 
     */
    public ListarContatos createListarContatos() {
        return new ListarContatos();
    }

    /**
     * Create an instance of {@link CriarContatoResponse }
     * 
     */
    public CriarContatoResponse createCriarContatoResponse() {
        return new CriarContatoResponse();
    }

    /**
     * Create an instance of {@link AlterarContatoResponse }
     * 
     */
    public AlterarContatoResponse createAlterarContatoResponse() {
        return new AlterarContatoResponse();
    }

    /**
     * Create an instance of {@link ContatoPorIDResponse }
     * 
     */
    public ContatoPorIDResponse createContatoPorIDResponse() {
        return new ContatoPorIDResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarContatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarContatos")
    public JAXBElement<ListarContatos> createListarContatos(ListarContatos value) {
        return new JAXBElement<ListarContatos>(_ListarContatos_QNAME, ListarContatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContatoPorNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "contatoPorNomeResponse")
    public JAXBElement<ContatoPorNomeResponse> createContatoPorNomeResponse(ContatoPorNomeResponse value) {
        return new JAXBElement<ContatoPorNomeResponse>(_ContatoPorNomeResponse_QNAME, ContatoPorNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContatoPorNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "contatoPorNome")
    public JAXBElement<ContatoPorNome> createContatoPorNome(ContatoPorNome value) {
        return new JAXBElement<ContatoPorNome>(_ContatoPorNome_QNAME, ContatoPorNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirContato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "excluirContato")
    public JAXBElement<ExcluirContato> createExcluirContato(ExcluirContato value) {
        return new JAXBElement<ExcluirContato>(_ExcluirContato_QNAME, ExcluirContato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContatoPorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "contatoPorIDResponse")
    public JAXBElement<ContatoPorIDResponse> createContatoPorIDResponse(ContatoPorIDResponse value) {
        return new JAXBElement<ContatoPorIDResponse>(_ContatoPorIDResponse_QNAME, ContatoPorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarContatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarContatoResponse")
    public JAXBElement<CriarContatoResponse> createCriarContatoResponse(CriarContatoResponse value) {
        return new JAXBElement<CriarContatoResponse>(_CriarContatoResponse_QNAME, CriarContatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarContatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alterarContatoResponse")
    public JAXBElement<AlterarContatoResponse> createAlterarContatoResponse(AlterarContatoResponse value) {
        return new JAXBElement<AlterarContatoResponse>(_AlterarContatoResponse_QNAME, AlterarContatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarContato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alterarContato")
    public JAXBElement<AlterarContato> createAlterarContato(AlterarContato value) {
        return new JAXBElement<AlterarContato>(_AlterarContato_QNAME, AlterarContato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarContato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarContato")
    public JAXBElement<CriarContato> createCriarContato(CriarContato value) {
        return new JAXBElement<CriarContato>(_CriarContato_QNAME, CriarContato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContatoPorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "contatoPorID")
    public JAXBElement<ContatoPorID> createContatoPorID(ContatoPorID value) {
        return new JAXBElement<ContatoPorID>(_ContatoPorID_QNAME, ContatoPorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcluirContatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "excluirContatoResponse")
    public JAXBElement<ExcluirContatoResponse> createExcluirContatoResponse(ExcluirContatoResponse value) {
        return new JAXBElement<ExcluirContatoResponse>(_ExcluirContatoResponse_QNAME, ExcluirContatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarContatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarContatosResponse")
    public JAXBElement<ListarContatosResponse> createListarContatosResponse(ListarContatosResponse value) {
        return new JAXBElement<ListarContatosResponse>(_ListarContatosResponse_QNAME, ListarContatosResponse.class, null, value);
    }

}
