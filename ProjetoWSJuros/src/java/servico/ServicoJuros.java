/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import negocio.JurosComposto;
import negocio.JurosSimples;

/**
 *
 * @author 02376421152
 */
@WebService(serviceName = "ServicoJuroSimplesComposto")
public class ServicoJuros {

    private JurosComposto jurosComposto;
    private JurosSimples jurosSimples;

    public ServicoJuros() {
        this.jurosComposto = new JurosComposto();
        this.jurosSimples = new JurosSimples();
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "jurosSimples")
    public float calcularJurosSimples(float C, float t, float n) {
        this.jurosSimples.calcularJuro(C, t, n);
        return this.jurosSimples.getJuros();

    }

    @WebMethod(operationName = "jurosSimplesMontante")
    public float calcularMontanteJuroSimples(float C, float t, float n) {
        this.jurosSimples.calcularMontante(C, t, n);
        return this.jurosSimples.getMontante();

    }

    @WebMethod(operationName = "taxa")
    public float processaTaxa(float C, float M) {
        this.jurosSimples.processaTaxa(C, M);
        return this.jurosSimples.getTaxa();

    }

    /**
     * This is a sample web service operation
     *
     */
    @WebMethod(operationName = "jurosComposto")
    public float calcularJuroComposto(float capital, float taxa, float periodo) {

        jurosComposto.calcularJuro(capital, taxa, periodo);
        return jurosComposto.getJuros();

    }

    @WebMethod(operationName = "montanteComposto")
    public float calcularMontanteJuroComposto(float capital, float taxa, float periodo) {
        jurosComposto.calcularMontante(capital, taxa, periodo);
        return jurosComposto.getMontante();
    }

}
