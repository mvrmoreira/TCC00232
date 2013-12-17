/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_iterator;

/**
 *
 * @author 10831011
 */
public class IteratorArray implements Iterator {
    MenuItem[] itens;
    int position = 0;

    public IteratorArray(MenuItem[] itens) {
        this.itens = itens;
    }

    @Override
    public Object next() {
        MenuItem item = this.itens[this.position];
        this.position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.itens.length || this.itens[this.position] == null){
            return false;
        }
        else {
            return true;
        }
    }
    
}
