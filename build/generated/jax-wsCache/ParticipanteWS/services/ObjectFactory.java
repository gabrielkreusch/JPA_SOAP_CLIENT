
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

    private final static QName _DeleteParticipante_QNAME = new QName("http://services/", "deleteParticipante");
    private final static QName _DeleteParticipanteResponse_QNAME = new QName("http://services/", "deleteParticipanteResponse");
    private final static QName _ParticipantePorIDResponse_QNAME = new QName("http://services/", "participantePorIDResponse");
    private final static QName _CriarParticipanteResponse_QNAME = new QName("http://services/", "criarParticipanteResponse");
    private final static QName _CriarParticipante_QNAME = new QName("http://services/", "criarParticipante");
    private final static QName _ListarParticipantesResponse_QNAME = new QName("http://services/", "listarParticipantesResponse");
    private final static QName _ParticipantePorID_QNAME = new QName("http://services/", "participantePorID");
    private final static QName _AlteraParticipante_QNAME = new QName("http://services/", "alteraParticipante");
    private final static QName _ListarParticipantes_QNAME = new QName("http://services/", "listarParticipantes");
    private final static QName _AlteraParticipanteResponse_QNAME = new QName("http://services/", "alteraParticipanteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarParticipantes }
     * 
     */
    public ListarParticipantes createListarParticipantes() {
        return new ListarParticipantes();
    }

    /**
     * Create an instance of {@link AlteraParticipante }
     * 
     */
    public AlteraParticipante createAlteraParticipante() {
        return new AlteraParticipante();
    }

    /**
     * Create an instance of {@link AlteraParticipanteResponse }
     * 
     */
    public AlteraParticipanteResponse createAlteraParticipanteResponse() {
        return new AlteraParticipanteResponse();
    }

    /**
     * Create an instance of {@link CriarParticipanteResponse }
     * 
     */
    public CriarParticipanteResponse createCriarParticipanteResponse() {
        return new CriarParticipanteResponse();
    }

    /**
     * Create an instance of {@link DeleteParticipante }
     * 
     */
    public DeleteParticipante createDeleteParticipante() {
        return new DeleteParticipante();
    }

    /**
     * Create an instance of {@link DeleteParticipanteResponse }
     * 
     */
    public DeleteParticipanteResponse createDeleteParticipanteResponse() {
        return new DeleteParticipanteResponse();
    }

    /**
     * Create an instance of {@link ParticipantePorIDResponse }
     * 
     */
    public ParticipantePorIDResponse createParticipantePorIDResponse() {
        return new ParticipantePorIDResponse();
    }

    /**
     * Create an instance of {@link CriarParticipante }
     * 
     */
    public CriarParticipante createCriarParticipante() {
        return new CriarParticipante();
    }

    /**
     * Create an instance of {@link ListarParticipantesResponse }
     * 
     */
    public ListarParticipantesResponse createListarParticipantesResponse() {
        return new ListarParticipantesResponse();
    }

    /**
     * Create an instance of {@link ParticipantePorID }
     * 
     */
    public ParticipantePorID createParticipantePorID() {
        return new ParticipantePorID();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteParticipante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteParticipante")
    public JAXBElement<DeleteParticipante> createDeleteParticipante(DeleteParticipante value) {
        return new JAXBElement<DeleteParticipante>(_DeleteParticipante_QNAME, DeleteParticipante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteParticipanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteParticipanteResponse")
    public JAXBElement<DeleteParticipanteResponse> createDeleteParticipanteResponse(DeleteParticipanteResponse value) {
        return new JAXBElement<DeleteParticipanteResponse>(_DeleteParticipanteResponse_QNAME, DeleteParticipanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantePorIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "participantePorIDResponse")
    public JAXBElement<ParticipantePorIDResponse> createParticipantePorIDResponse(ParticipantePorIDResponse value) {
        return new JAXBElement<ParticipantePorIDResponse>(_ParticipantePorIDResponse_QNAME, ParticipantePorIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarParticipanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarParticipanteResponse")
    public JAXBElement<CriarParticipanteResponse> createCriarParticipanteResponse(CriarParticipanteResponse value) {
        return new JAXBElement<CriarParticipanteResponse>(_CriarParticipanteResponse_QNAME, CriarParticipanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarParticipante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "criarParticipante")
    public JAXBElement<CriarParticipante> createCriarParticipante(CriarParticipante value) {
        return new JAXBElement<CriarParticipante>(_CriarParticipante_QNAME, CriarParticipante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarParticipantesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarParticipantesResponse")
    public JAXBElement<ListarParticipantesResponse> createListarParticipantesResponse(ListarParticipantesResponse value) {
        return new JAXBElement<ListarParticipantesResponse>(_ListarParticipantesResponse_QNAME, ListarParticipantesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticipantePorID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "participantePorID")
    public JAXBElement<ParticipantePorID> createParticipantePorID(ParticipantePorID value) {
        return new JAXBElement<ParticipantePorID>(_ParticipantePorID_QNAME, ParticipantePorID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlteraParticipante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alteraParticipante")
    public JAXBElement<AlteraParticipante> createAlteraParticipante(AlteraParticipante value) {
        return new JAXBElement<AlteraParticipante>(_AlteraParticipante_QNAME, AlteraParticipante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarParticipantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarParticipantes")
    public JAXBElement<ListarParticipantes> createListarParticipantes(ListarParticipantes value) {
        return new JAXBElement<ListarParticipantes>(_ListarParticipantes_QNAME, ListarParticipantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlteraParticipanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "alteraParticipanteResponse")
    public JAXBElement<AlteraParticipanteResponse> createAlteraParticipanteResponse(AlteraParticipanteResponse value) {
        return new JAXBElement<AlteraParticipanteResponse>(_AlteraParticipanteResponse_QNAME, AlteraParticipanteResponse.class, null, value);
    }

}
