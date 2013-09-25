/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Moreira
 */
abstract public class Forma {
    
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    abstract public float CalculaPerimetro();    
}
