/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_iterator;

import java.util.ArrayList;

/**
 *
 * @author 10831011
 */
public class IteratorArrayList implements Iterator {
    private ArrayList itens;
    int position = 0;

    public IteratorArrayList(ArrayList itens) {
        this.itens = itens;
    }
    
    @Override
    public boolean hasNext() {
        if (this.position >= this.itens.size() || this.itens.get(this.position) == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        return this.itens.get(this.position);
    }
    
}
