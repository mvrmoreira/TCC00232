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
public class MenuRestaurante implements Menu {
    
    private ArrayList itens;

    public MenuRestaurante(ArrayList itens) {
        this.itens = itens;
    }

    @Override
    public Iterator createIterator() {
        return new IteratorArrayList(this.itens);
    }
    
}
