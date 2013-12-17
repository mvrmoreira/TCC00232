
package prova;

/**
 *
 * @author moreira
 * @param <E>
 */
public class Gerenciador<E> 
{
    private List<E> itens;
    private Sort ordenacao;

    /**
     *
     * @param itens
     */
    public Gerenciador(List<E> itens) 
    {
        this.itens = itens;
    }
    
    /**
     * terminar aqui
     * @param tipo 
     */
    public void cadastraItem(String tipo)
    {
        SimpleItemFactory factory = new SimpleItemFactory();
        Item item = factory.createItem(tipo);       
        this.itens.adicionar((E) item);
    }
    
    public float consultaPreco(String nomeItem) throws Exception
    {
        while (this.itens.hasNext())
        {
            E item = (E) this.itens.getNext();
            // terminar aqui
        }
        
        throw new Exception("Item não encontrado!");
    }
}
