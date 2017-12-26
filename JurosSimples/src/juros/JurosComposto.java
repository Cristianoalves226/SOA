/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juros;

/**
 *
 * @author 02376421152
 */
public class JurosComposto {

    private float juros;
    private float Capital;
    private float taxa;
    private float periodo;
    private float montante;

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
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
        setCapital(Capital);
        setTaxa(taxa);
        setPeriodo(periodo);
        montante = (float) (getCapital() * (Math.pow(1 + getTaxa(), getPeriodo())));
        System.out.println("montante 1"+montante);
        return montante;
    }

    public float processaJurosComposto() {
        float mont = getMontante();
        juros = mont - getCapital();
        System.out.println("capital "+Capital);
        System.out.println("montante "+mont);
        return juros;
    }
}
