
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocalWS", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocalWS {


    /**
     * 
     * @param idlocal
     * @return
     *     returns services.Local
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "localPorID", targetNamespace = "http://services/", className = "services.LocalPorID")
    @ResponseWrapper(localName = "localPorIDResponse", targetNamespace = "http://services/", className = "services.LocalPorIDResponse")
    @Action(input = "http://services/LocalWS/localPorIDRequest", output = "http://services/LocalWS/localPorIDResponse")
    public Local localPorID(
        @WebParam(name = "idlocal", targetNamespace = "")
        long idlocal);

    /**
     * 
     * @param cidade
     * @param numero
     * @param bairro
     * @param descricao
     * @param rua
     * @param cep
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "criarLocal", targetNamespace = "http://services/", className = "services.CriarLocal")
    @ResponseWrapper(localName = "criarLocalResponse", targetNamespace = "http://services/", className = "services.CriarLocalResponse")
    @Action(input = "http://services/LocalWS/criarLocalRequest", output = "http://services/LocalWS/criarLocalResponse")
    public boolean criarLocal(
        @WebParam(name = "descricao", targetNamespace = "")
        String descricao,
        @WebParam(name = "rua", targetNamespace = "")
        String rua,
        @WebParam(name = "bairro", targetNamespace = "")
        String bairro,
        @WebParam(name = "cidade", targetNamespace = "")
        String cidade,
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "cep", targetNamespace = "")
        String cep);

    /**
     * 
     * @param cidade
     * @param numero
     * @param bairro
     * @param idlocal
     * @param descricao
     * @param rua
     * @param cep
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "alterarLocal", targetNamespace = "http://services/", className = "services.AlterarLocal")
    @ResponseWrapper(localName = "alterarLocalResponse", targetNamespace = "http://services/", className = "services.AlterarLocalResponse")
    @Action(input = "http://services/LocalWS/alterarLocalRequest", output = "http://services/LocalWS/alterarLocalResponse")
    public boolean alterarLocal(
        @WebParam(name = "idlocal", targetNamespace = "")
        long idlocal,
        @WebParam(name = "descricao", targetNamespace = "")
        String descricao,
        @WebParam(name = "rua", targetNamespace = "")
        String rua,
        @WebParam(name = "bairro", targetNamespace = "")
        String bairro,
        @WebParam(name = "cidade", targetNamespace = "")
        String cidade,
        @WebParam(name = "numero", targetNamespace = "")
        String numero,
        @WebParam(name = "cep", targetNamespace = "")
        String cep);

    /**
     * 
     * @param idlocal
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "excluirLocal", targetNamespace = "http://services/", className = "services.ExcluirLocal")
    @ResponseWrapper(localName = "excluirLocalResponse", targetNamespace = "http://services/", className = "services.ExcluirLocalResponse")
    @Action(input = "http://services/LocalWS/excluirLocalRequest", output = "http://services/LocalWS/excluirLocalResponse")
    public boolean excluirLocal(
        @WebParam(name = "idlocal", targetNamespace = "")
        long idlocal);

    /**
     * 
     * @return
     *     returns java.util.List<services.Local>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarLocais", targetNamespace = "http://services/", className = "services.ListarLocais")
    @ResponseWrapper(localName = "listarLocaisResponse", targetNamespace = "http://services/", className = "services.ListarLocaisResponse")
    @Action(input = "http://services/LocalWS/listarLocaisRequest", output = "http://services/LocalWS/listarLocaisResponse")
    public List<Local> listarLocais();

}