/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Moreira
 */
public class Circulo extends Forma {
    
    private Ponto2D centro;
    private float raio;

    public Ponto2D getCentro() {
        return centro;
    }

    public void setComprimento(Ponto2D centro) {
        this.centro = centro;
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float CalculaPerimetro() {
        return (float) (2 * 3.14 * this.getRaio());
    }
    
}
