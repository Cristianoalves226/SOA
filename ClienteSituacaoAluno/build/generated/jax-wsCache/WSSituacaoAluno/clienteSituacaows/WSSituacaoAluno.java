
package clienteSituacaows;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSSituacaoAluno", targetNamespace = "http://servico/", wsdlLocation = "http://localhost:8080/WSSituacaoAluno/WSSituacaoAluno?wsdl")
public class WSSituacaoAluno
    extends Service
{

    private final static URL WSSITUACAOALUNO_WSDL_LOCATION;
    private final static WebServiceException WSSITUACAOALUNO_EXCEPTION;
    private final static QName WSSITUACAOALUNO_QNAME = new QName("http://servico/", "WSSituacaoAluno");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSSituacaoAluno/WSSituacaoAluno?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSITUACAOALUNO_WSDL_LOCATION = url;
        WSSITUACAOALUNO_EXCEPTION = e;
    }

    public WSSituacaoAluno() {
        super(__getWsdlLocation(), WSSITUACAOALUNO_QNAME);
    }

    public WSSituacaoAluno(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSITUACAOALUNO_QNAME, features);
    }

    public WSSituacaoAluno(URL wsdlLocation) {
        super(wsdlLocation, WSSITUACAOALUNO_QNAME);
    }

    public WSSituacaoAluno(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSITUACAOALUNO_QNAME, features);
    }

    public WSSituacaoAluno(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSSituacaoAluno(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicoSituacaoAluno
     */
    @WebEndpoint(name = "servicoSituacaoAlunoPort")
    public ServicoSituacaoAluno getServicoSituacaoAlunoPort() {
        return super.getPort(new QName("http://servico/", "servicoSituacaoAlunoPort"), ServicoSituacaoAluno.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicoSituacaoAluno
     */
    @WebEndpoint(name = "servicoSituacaoAlunoPort")
    public ServicoSituacaoAluno getServicoSituacaoAlunoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servico/", "servicoSituacaoAlunoPort"), ServicoSituacaoAluno.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSITUACAOALUNO_EXCEPTION!= null) {
            throw WSSITUACAOALUNO_EXCEPTION;
        }
        return WSSITUACAOALUNO_WSDL_LOCATION;
    }

}
