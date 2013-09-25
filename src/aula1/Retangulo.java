/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Moreira
 */
public class Retangulo extends Forma {
    
    private float largura;
    private float comprimento;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public float CalculaPerimetro() {
        return this.getComprimento()* this.getLargura();
    }
    
}
