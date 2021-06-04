
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de participante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="participante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcompromisso" type="{http://services/}compromisso" minOccurs="0"/>
 *         &lt;element name="idcontato" type="{http://services/}contato" minOccurs="0"/>
 *         &lt;element name="idparticipante" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participante", propOrder = {
    "idcompromisso",
    "idcontato",
    "idparticipante",
    "status"
})
public class Participante {

    protected Compromisso idcompromisso;
    protected Contato idcontato;
    protected Long idparticipante;
    protected boolean status;

    /**
     * Obtém o valor da propriedade idcompromisso.
     * 
     * @return
     *     possible object is
     *     {@link Compromisso }
     *     
     */
    public Compromisso getIdcompromisso() {
        return idcompromisso;
    }

    /**
     * Define o valor da propriedade idcompromisso.
     * 
     * @param value
     *     allowed object is
     *     {@link Compromisso }
     *     
     */
    public void setIdcompromisso(Compromisso value) {
        this.idcompromisso = value;
    }

    /**
     * Obtém o valor da propriedade idcontato.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getIdcontato() {
        return idcontato;
    }

    /**
     * Define o valor da propriedade idcontato.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setIdcontato(Contato value) {
        this.idcontato = value;
    }

    /**
     * Obtém o valor da propriedade idparticipante.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdparticipante() {
        return idparticipante;
    }

    /**
     * Define o valor da propriedade idparticipante.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdparticipante(Long value) {
        this.idparticipante = value;
    }

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

}
