/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author 02376421152
 */
public class Principal {

    public static void main(String[] args) {
        wsjuros.ServicoJuroSimplesComposto service = new wsjuros.ServicoJuroSimplesComposto();
        wsjuros.ServicoJuros port = service.getServicoJurosPort();

        System.out.println("----------------------JUROS SIMPLES---------------------------");
        System.out.println("Juros é " + port.jurosSimples(1000, 1.1f, 1) + " reais");

        System.out.println("O montante é " + port.jurosSimplesMontante(1000, 1.1f, 1));

        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("-----------------------JUROS COMPOSTO ----------------------");

        System.out.println("O juros produzido é = " + port.jurosComposto(8000, 6, 4));
        System.out.println("O montade é = " + port.montanteComposto(8000, 6f, 4));
        System.out.println("-------------------------------------------------------------");
    }

}
