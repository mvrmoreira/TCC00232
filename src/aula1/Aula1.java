/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Moreira
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(2);
        System.out.println("Perimetro do circulo: " + c.CalculaPerimetro());
        
        Retangulo r = new Retangulo();
        r.setComprimento((float)10.21);
        r.setLargura(9);
        System.out.println("Perimetro retangulo: " + r.CalculaPerimetro());
    }
}
