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
        JurosSimples j = new JurosSimples();
        j.processaJurossSimples(1000f, 0.011f, 1);
        j.processaMontante(1000);
        JurosSimples j2 = new JurosSimples();
        j2.processaTaxa(12000, 14640);
        DecimalFormat df = new DecimalFormat("0.####");
        JurosComposto jc = new JurosComposto();
        jc.processaJurosCompostoMontante(8000f, 0.06f, 4f);
        jc.processaJurosComposto();
       
        
        System.out.println("-------------------------------");
        System.out.println("Juros Simples e Juros Compostos".toUpperCase());
        System.out.println("-------------------------------");
        System.out.println("Juros Simples é = " + j.getJuros());
        System.out.println("Taxa é " + j2.getTaxa());

        System.out.println("-------------------------------");
        System.out.println("Juros Composto Montante é = " + jc.getMontante());
        System.out.println("Juros produzido é = " + jc.getJuros());

    }

}
