
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
}
