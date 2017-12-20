/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author 02376421152
 */
public class Calculadora {

    public static double somar(double termo1, double termo2) {
        return termo1 + termo2;
    }

    public static double subtrair(double termo1, double termo2) {
        return termo1 - termo2;
    }

    public static double multiplicar(double termo1, double termo2) {
        return termo1 * termo2;
    }

    public static double dividir(double termo1, double termo2) {
        if (termo2 > 0) {
            return termo1 / termo2;
        } else {
            return 0;
        }
    }

}
