
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de criarParticipante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idcontato" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idcompromisso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarParticipante", propOrder = {
    "status",
    "idcontato",
    "idcompromisso"
})
public class CriarParticipante {

    protected boolean status;
    protected long idcontato;
    protected long idcompromisso;

    /**
     * Obtém o valor da propriedade status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade idcontato.
     * 
     */
    public long getIdcontato() {
        return idcontato;
    }

    /**
     * Define o valor da propriedade idcontato.
     * 
     */
    public void setIdcontato(long value) {
        this.idcontato = value;
    }

    /**
     * Obtém o valor da propriedade idcompromisso.
     * 
     */
    public long getIdcompromisso() {
        return idcompromisso;
    }

    /**
     * Define o valor da propriedade idcompromisso.
     * 
     */
    public void setIdcompromisso(long value) {
        this.idcompromisso = value;
    }

}
