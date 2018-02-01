
package clienteSituacaows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterSituacaoAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterSituacaoAluno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterSituacaoAluno", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class ObterSituacaoAluno {

    protected float arg0;
    protected float arg1;
    protected float arg2;
    protected float arg3;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     */
    public float getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     */
    public void setArg0(float value) {
        this.arg0 = value;
    }

    /**
     * Obtém o valor da propriedade arg1.
     * 
     */
    public float getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     */
    public void setArg1(float value) {
        this.arg1 = value;
    }

    /**
     * Obtém o valor da propriedade arg2.
     * 
     */
    public float getArg2() {
        return arg2;
    }

    /**
     * Define o valor da propriedade arg2.
     * 
     */
    public void setArg2(float value) {
        this.arg2 = value;
    }

    /**
     * Obtém o valor da propriedade arg3.
     * 
     */
    public float getArg3() {
        return arg3;
    }

    /**
     * Define o valor da propriedade arg3.
     * 
     */
    public void setArg3(float value) {
        this.arg3 = value;
    }

}
