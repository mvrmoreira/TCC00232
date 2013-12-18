
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

    /**
     *
     * @param l
     */
    @Override
    public void ordena(List l)
    {
        boolean trocou = true;
        Object currentItem, nextItem;
        
        while (trocou)
        {
            trocou = false;
            l.resetPosition();
            currentItem = l.getNext();
            while (l.hasNext())
            {
                nextItem = l.getNext();
                if (this.comparador.compara(currentItem, nextItem) > 0)
                {
                    l.trocaItens(nextItem, currentItem);
                    trocou = true;
                }
                else
                {
                    currentItem = nextItem;
                }
            }
        }
    }    
}
