/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import ws.ServicoJurosComposto_Service;

/**
 *
 * @author 02376421152
 */
public class Principal {

    public static void main(String[] args) {
        ws.ServicoJurosComposto_Service service = new ServicoJurosComposto_Service();
        ws.ServicoJurosComposto port = service.getServicoJurosCompostoPort();

        System.out.println("O montade é = " + port.montante(8000, 0.06f, 4));
        System.out.println("O juros composto é = " + port.jurosComposto(8000, 0.06f, 4));
    }
}
