
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de compromissoPorID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="compromissoPorID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "compromissoPorID", propOrder = {
    "idcompromisso"
})
public class CompromissoPorID {

    protected long idcompromisso;

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
