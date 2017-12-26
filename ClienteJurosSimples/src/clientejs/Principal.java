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
        clientews.ServicoJurosSimples_Service service = new ServicoJurosSimples_Service();
        clientews.ServicoJurosSimples port = service.getServicoJurosSimplesPort();

        System.out.println("Juro e " + port.jurosSimples(1000, 0.011f, 1));

    }
}
