package aplicacao;

import servico.ServicoCalculadora;
import servico.ServicoCalculadora_Service;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicoCalculadora_Service service = new ServicoCalculadora_Service();
        ServicoCalculadora port = service.getServicoCalculadoraPort();
        System.out.println("Soma = "+port.somar(20, 30));
    }

}
