
package prova;

/**
 *
 * @author moreira
 */
public class BubbleSort extends Sort
{
    public BubbleSort(Comparador comparador) 
    {
        this.comparador = comparador;
    }    

    @Override
    public void ordena(List l)
    {
        System.out.println("Ordena itens com bubble sort.");
    }    
}
