/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import juros.JurosComposto;

/**
 *
 * @author 02376421152
 */
@WebService(serviceName = "servicoJurosComposto")
public class servicoJurosComposto {

    private juros.JurosComposto jc;

    public servicoJurosComposto() {
        this.jc = new JurosComposto();
    }

    /**
     * This is a sample web service operation
     *
     */
    @WebMethod(operationName = "jurosComposto")
    public float processaJurosComposto(float capital, float taxa, float periodo) {

        jc.processaJurosComposto(capital, taxa, periodo);
        return jc.getJuros();

    }

    @WebMethod(operationName = "montante")
    public float processaMontante(float capital, float taxa, float periodo) {
        jc.processaJurosCompostoMontante(capital, taxa, periodo);
        return jc.getMontante();
    }

}
