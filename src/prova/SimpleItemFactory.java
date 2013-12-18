
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
            case "carro": return new Carro("Carro sem nome", 0);
            case "moto": return new Moto("Moto sem nome", 0);
        }
        return null;
    }    
}