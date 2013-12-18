
package prova;

/**
 *
 * @author moreira
 */
public class ComparadorItem implements Comparador<Item>
{
    @Override
    public int compara(Item one, Item two) 
    {
        if (one.getPreco() < two.getPreco())
        {
            return -1;
        }
        else if (one.getPreco() == two.getPreco())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }    
}
