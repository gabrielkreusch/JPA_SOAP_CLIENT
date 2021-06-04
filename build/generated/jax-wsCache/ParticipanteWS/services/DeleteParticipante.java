
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deleteParticipante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deleteParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idparticipante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteParticipante", propOrder = {
    "idparticipante"
})
public class DeleteParticipante {

    protected long idparticipante;

    /**
     * Obtém o valor da propriedade idparticipante.
     * 
     */
    public long getIdparticipante() {
        return idparticipante;
    }

    /**
     * Define o valor da propriedade idparticipante.
     * 
     */
    public void setIdparticipante(long value) {
        this.idparticipante = value;
    }

}
