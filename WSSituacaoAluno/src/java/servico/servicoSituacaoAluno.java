/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cristiano 776
 */
@WebService(serviceName = "WSSituacaoAluno")
public class servicoSituacaoAluno {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "obterSituacaoAluno")
    public String obterSituacaoAluno(float nota1, float nota2, float nota3, float nota4) {
        String resp = "";
        float media = calcularMedia(nota1, nota2, nota3, nota4);
        if (media >= 7) {
            resp = "Aprovado";
        } else if (media >= 4) {
            resp = "Exame Final";
        } else {
            resp = "Reprovado";
        }
        return resp;
    }

    private float calcularMedia(float nota1, float nota2, float nota3, float nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
