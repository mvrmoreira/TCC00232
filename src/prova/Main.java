
package prova;

import java.util.Scanner;

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
        itens.adicionar(new Carro("Fusca", 3000));
        
        Sort ordenacao = new BubbleSort(new ComparadorItem());
        Gerenciador<Item> gerenciador = new Gerenciador<>(itens, ordenacao);
        
        gerenciador.cadastraItem("carro"); 
        
        System.out.println("Itens desordenados: ");
        gerenciador.imprimeItens();
        
        System.out.println("\n Ordenando itens...\n");
        gerenciador.ordenaItens();
        
        System.out.println("Itens ordenados: ");
        gerenciador.imprimeItens();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do item: ");
        String nomeItem = s.nextLine();
        
        try 
        {            
            float preco = gerenciador.consultaPreco(nomeItem);
            System.out.println("Preço do item: R$ " + preco);
        } 
        catch (Exception ex) 
        {
            System.out.println("Item não encontrado!");
        }
    }
    
}
