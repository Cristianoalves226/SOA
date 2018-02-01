
package clienteSituacaows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clienteSituacaows package. 
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

    private final static QName _ObterSituacaoAluno_QNAME = new QName("http://servico/", "obterSituacaoAluno");
    private final static QName _ObterSituacaoAlunoResponse_QNAME = new QName("http://servico/", "obterSituacaoAlunoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clienteSituacaows
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterSituacaoAlunoResponse }
     * 
     */
    public ObterSituacaoAlunoResponse createObterSituacaoAlunoResponse() {
        return new ObterSituacaoAlunoResponse();
    }

    /**
     * Create an instance of {@link ObterSituacaoAluno }
     * 
     */
    public ObterSituacaoAluno createObterSituacaoAluno() {
        return new ObterSituacaoAluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterSituacaoAluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "obterSituacaoAluno")
    public JAXBElement<ObterSituacaoAluno> createObterSituacaoAluno(ObterSituacaoAluno value) {
        return new JAXBElement<ObterSituacaoAluno>(_ObterSituacaoAluno_QNAME, ObterSituacaoAluno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterSituacaoAlunoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "obterSituacaoAlunoResponse")
    public JAXBElement<ObterSituacaoAlunoResponse> createObterSituacaoAlunoResponse(ObterSituacaoAlunoResponse value) {
        return new JAXBElement<ObterSituacaoAlunoResponse>(_ObterSituacaoAlunoResponse_QNAME, ObterSituacaoAlunoResponse.class, null, value);
    }

}
