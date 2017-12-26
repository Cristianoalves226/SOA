/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsjuros;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.JurosSimples;

/**
 *
 * @author 02376421152
 */
@WebService(serviceName = "servicoJurosSimples")
public class servicoJurosSimples {

    JurosSimples jur = new JurosSimples();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "jurosSimples")
    public float processaJurossSimples(float C, float t, float n) {
        jur.processaJurossSimples(C, t, n);
        return jur.getTaxa();

    }

    @WebMethod(operationName = "montante")
    public float processaMontante(float C) {
        jur.processaMontante(C);
        return jur.getMontante();
    }

    @WebMethod(operationName = "taxa")
    public float processaTaxa(float C, float M) {
        jur.processaTaxa(C, M);
        return jur.getTaxa();

    }
}
