/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsjuros;

import javax.jws.WebService;
import javax.jws.WebMethod;
import negocio.JurosSimples;

/**
 *
 * @author 02376421152
 */
@WebService(serviceName = "servicoJurosSimples")
public class servicoJurosSimples {

    private JurosSimples jurosSimples;

    public servicoJurosSimples() {
        this.jurosSimples = new JurosSimples();
    }
    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "jurosSimples")
    public float processaJurossSimples(float C, float t, float n) {
        this.jurosSimples.processaJurossSimples(C, t, n);
        return this.jurosSimples.getJuros();

    }

    @WebMethod(operationName = "montante")
    public float processaMontante(float c, float t, float n) {
        this.jurosSimples.processaMontante(c, t,n);
        return this.jurosSimples.getMontante();
    }

    @WebMethod(operationName = "taxa")
    public float processaTaxa(float C, float M) {
        this.jurosSimples.processaTaxa(C, M);
        return this.jurosSimples.getTaxa();

    }
}
