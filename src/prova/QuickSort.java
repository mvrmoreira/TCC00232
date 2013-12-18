
package prova;

/**
 *
 * @author moreira
 */
public class QuickSort extends Sort
{
    public QuickSort(Comparador comparador) 
    {
        this.comparador = comparador;        
    }
    
    @Override
    public void ordena(List l)
    {
        System.out.println("Ordena itens com quick sort.");
    }
    
}
