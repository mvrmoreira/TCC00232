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
public class Garconete {
    private ArrayList menus;

    public Garconete(ArrayList menus) {
        this.menus = menus;
    }
    
    public Iterator createIterator() {
        return new IteratorArrayList(menus);
    }
    
    public void printMenus()
    {
        Iterator menuIterator = this.createIterator();
        while (menuIterator.hasNext())
        {
            Menu menu = (Menu) menuIterator.next();
            this.printItensDoMenu(menu.createIterator());
        }
    }
    
    private void printItensDoMenu(Iterator itens)
    {
        while (itens.hasNext())
        {
            MenuItem item = (MenuItem) itens.next();
            System.out.println("Descricao: " + item.getDescricao());
            System.out.println("Preço: " + item.getPreco());
        }
    }
}
