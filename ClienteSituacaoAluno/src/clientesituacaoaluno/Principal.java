/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesituacaoaluno;

import clienteSituacaows.WSSituacaoAluno;
import java.util.Scanner;

/**
 *
 * @author Cristiano 776
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clienteSituacaows.WSSituacaoAluno serice = new WSSituacaoAluno();
        clienteSituacaows.ServicoSituacaoAluno port = serice.getServicoSituacaoAlunoPort();

        System.out.println("Aluno1: " + port.obterSituacaoAluno(1, 5, 3, 2));
        System.out.println("Aluno1: " + port.obterSituacaoAluno(6, 4, 3, 5));
        System.out.println("Aluno1: " + port.obterSituacaoAluno(7, 8, 3, 9));
    }

}
