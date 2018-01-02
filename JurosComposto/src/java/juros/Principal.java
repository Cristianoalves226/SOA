/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juros;

import java.text.DecimalFormat;

/**
 *
 * @author 02376421152
 */
public class Principal {

    public static void main(String[] args) {
       
        
        DecimalFormat df = new DecimalFormat("0.####");
        JurosComposto jc = new JurosComposto();
       
        jc.processaJurosCompostoMontante(8000, 0.06f, 4);
        jc.processaJurosComposto(8000, 0.06f, 4f);
       
        
     

        System.out.println("-------------------------------");
        System.out.println("Juros Composto Montante é = " + jc.getMontante());
        System.out.println("Juros produzido é = " + jc.getJuros());

    }

}
