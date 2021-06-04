
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de localPorID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="localPorID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idlocal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localPorID", propOrder = {
    "idlocal"
})
public class LocalPorID {

    protected long idlocal;

    /**
     * Obtém o valor da propriedade idlocal.
     * 
     */
    public long getIdlocal() {
        return idlocal;
    }

    /**
     * Define o valor da propriedade idlocal.
     * 
     */
    public void setIdlocal(long value) {
        this.idlocal = value;
    }

}
