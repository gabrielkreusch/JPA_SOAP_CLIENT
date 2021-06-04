
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarCompromisso complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarCompromisso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcompromisso" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "alterarCompromisso", propOrder = {
    "idcompromisso",
    "dataInicio",
    "dataFim",
    "idlocal"
})
public class AlterarCompromisso {

    protected long idcompromisso;
    protected String dataInicio;
    protected String dataFim;
    protected long idlocal;

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

    /**
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFim(String value) {
        this.dataFim = value;
    }

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
