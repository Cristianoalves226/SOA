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
public class JurosSimples {

    private float juros;
    private float Capital;
    private float taxa;
    private float periodo;
    private float montante;

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

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

    public float processaJurossSimples(float C, float t, float n) {
        setCapital(Capital);
        setTaxa(taxa);
        setPeriodo(periodo);
        return juros = getCapital() * getTaxa() * getPeriodo();
    }

    public float processaMontante(float C) {
        return montante = C + getJuros();
    }

    public float processaTaxa(float C, float M) {

        return taxa = (M / C) - 1f;

    }

}
