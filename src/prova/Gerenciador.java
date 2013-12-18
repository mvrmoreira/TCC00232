
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
    public Gerenciador(List<E> itens, Sort ordenacao) 
    {
        this.itens = itens;
        this.ordenacao = ordenacao;
    }
    
    /**
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
            Item item = (Item) this.itens.getNext();
            if (item.getNome() == nomeItem)
            {
                return item.getPreco();
            }
        }
        
        throw new Exception("Item não encontrado!");
    }
}
