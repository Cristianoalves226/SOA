/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.Calculadora;

/**
 *
 * @author 02376421152
 */
@WebService(serviceName = "ServicoCalculadoraPlu2")
public class ServicoCalculadoraPlus2 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "somar")
    public double processaSoma(double termo1, double termo2) {
        return Calculadora.somar(termo1, termo2);
    }

    @WebMethod(operationName = "subtrair")
    public double processaSubtracao(double termo1, double termo2) {
        return Calculadora.subtrair(termo1, termo2);
    }

    @WebMethod(operationName = "multiplicar")
    public double processaMultiplicar(double termo1, double termo2) {
        return Calculadora.multiplicar(termo1, termo2);
    }

    @WebMethod(operationName = "dividir")
    public double processaDividir(double termo1, double termo2) {
        return Calculadora.dividir(termo1, termo2);
    }
}
