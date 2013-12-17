/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_iterator;

/**
 *
 * @author 10831011
 */
public class MenuPadaria implements Menu {

    private MenuItem[] itens;

    public MenuPadaria(MenuItem[] itens) {
        this.itens = itens;
    }
    
    @Override
    public Iterator createIterator() {
        return new IteratorArray(this.itens);
    }
    
    
    
}
