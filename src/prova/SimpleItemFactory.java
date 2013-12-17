/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova;

/**
 *
 * @author moreira
 */
public class SimpleItemFactory 
{
    public Item createItem(String tipo)
    {
        switch (tipo)
        {
            case "carro": return new Carro();
            case "moto": return new Moto();
        }
        return null;
    }
    
}
