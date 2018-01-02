package clientejs;

import clientews.ServicoJurosSimples_Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 02376421152
 */
public class Principal {

    public static void main(String[] args) {
        wsjuros.ServicoJurosSimples_Service service = new wsjuros.ServicoJurosSimples_Service();
        wsjuros.ServicoJurosSimples port = service.getServicoJurosSimplesPort();

        System.out.println("Juros é " + port.jurosSimples(1000, 0.011f, 1)*100+" reais");
        
        System.out.println("O montante é "+port.montante(1000, 1.1f,1));

    }
}
