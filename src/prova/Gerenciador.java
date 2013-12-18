
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
     * @param ordenacao
     */
    public Gerenciador(List<E> itens, Sort ordenacao) 
    {
        this.itens = itens;
        this.ordenacao = ordenacao;
    }
    
    public void ordenaItens()
    {
        this.ordenacao.ordena(this.itens);
    }
    
    public void imprimeItens()
    {
        this.itens.resetPosition();
        while (itens.hasNext())
        {
            Item item = (Item) this.itens.getNext();
            System.out.println(item.getNome() + " - R$ " + item.getPreco());
        }
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
        this.itens.resetPosition();
        while (this.itens.hasNext())
        {
            Item item = (Item) this.itens.getNext();
            if (item.getNome().equals(nomeItem))
            {
                return (float) item.getPreco();
            }
        }
        
        throw new Exception("Item não encontrado!");
    }
}
