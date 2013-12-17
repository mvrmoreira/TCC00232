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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Menu da padaria
        MenuItem[] itensDaPadaria = new MenuItem[10];
        itensDaPadaria[0] = new MenuItem("Pão com ovo", 1.99);
        itensDaPadaria[1] = new MenuItem("Misto quente", 3.99);
        itensDaPadaria[2] = new MenuItem("Suco de laranja", 4.50);        
        MenuPadaria menuPadaria = new MenuPadaria(itensDaPadaria);
        
        // Menu do restaurante        
        ArrayList<MenuItem> itensDoRestaurante = new ArrayList<>();
        itensDoRestaurante.add(new MenuItem("Prato feito", 7.99));
        itensDoRestaurante.add(new MenuItem("Coca-cola", 5.00));
        itensDoRestaurante.add(new MenuItem("Rodízio", 58.00));        
        MenuRestaurante menuRestaurante = new MenuRestaurante(itensDoRestaurante);
        
        // Menus
        ArrayList<Menu> menus = new ArrayList<>(); 
        menus.add(menuPadaria);
        menus.add(menuRestaurante);
        
        // Garconete
        Garconete garconete = new Garconete(menus);
        garconete.printMenus();
    }
}
