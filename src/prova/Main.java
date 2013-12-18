
package prova;

/**
 *
 * @author moreira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {      
        List<Item> itens = new List<>();
        itens.adicionar(new Moto("Honda NXR Bros MIX ES 2010/2010", 6500));
        itens.adicionar(new Carro("Gol G6 Completo 2013/2013", (float) 28500.99));
        
        Sort ordenacao = new BubbleSort(new ComparadorItem());
        Gerenciador<Item> gerenciador = new Gerenciador<>(itens, ordenacao);
    }
    
}
