/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juros;

import java.io.Serializable;

/**
 *
 * @author 02376421152
 */
public class JurosComposto implements Serializable{

    private float jurosComposto;
    private float Capital;
    private float taxa;
    private float periodo;
    private float montante;

    public JurosComposto() {
    }

    
    public float getJuros() {
        return jurosComposto;
    }

    public void setJuros(float juros) {
        this.jurosComposto = juros;
    }

    public float getCapital() {
        return Capital;
    }

    public void setCapital(float Capital) {
        this.Capital = Capital;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public float getPeriodo() {
        return periodo;
    }

    public void setPeriodo(float periodo) {
        this.periodo = periodo;
    }

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public float processaJurosCompostoMontante(float Capital, float taxa, float periodo) {

        this.montante = (float) (Capital * (Math.pow(1 + taxa, periodo)));
        
        return this.montante;
    }

    public float processaJurosComposto(float Capital, float taxa, float periodo) {
        this.montante =  (float) (Capital * (Math.pow(1 + taxa, periodo)));

       this.jurosComposto = this.montante - Capital;

        return this.jurosComposto;
    }
}
