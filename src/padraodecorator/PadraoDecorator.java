/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodecorator;

/**
 *
 * @author 20931088
 */
public class PadraoDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gol carro = new GolPower();
        
        ArCondicionado acessorio1 = new ArCondicionado(carro);
        DirecaoHidraulica acessorio2 = new DirecaoHidraulica(acessorio1);
        QuatroPortas acessorio3 = new QuatroPortas(acessorio2);
        
        System.out.println(acessorio3.getDescricao());
        System.out.println(acessorio3.getCusto());
    }
}
