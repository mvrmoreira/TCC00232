
package prova;

import java.util.ArrayList;

/**
 *
 * @author moreira
 */
class List<E> implements Iterator
{
    private ArrayList itens = new ArrayList<E>();
    int position = 0;
    
    @Override
    public boolean hasNext() 
    {
        if (this.position >= this.itens.size() || this.itens.get(this.position) == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object getNext() 
    {
        return this.itens.get(this.position++);
    }

    public void adicionar(E item) 
    {
        this.itens.add(item);
    }
    
    public void resetPosition()
    {
        this.position = 0;
    }
    
    public void trocaItens(E previousItem, E currentItem)
    {
        this.itens.set(this.position - 2, previousItem);
        this.itens.set(this.position - 1, currentItem);
    }
}
