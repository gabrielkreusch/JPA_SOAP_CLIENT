
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contatoPorID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contatoPorID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcontato" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contatoPorID", propOrder = {
    "idcontato"
})
public class ContatoPorID {

    protected long idcontato;

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

}
