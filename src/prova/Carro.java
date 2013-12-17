
package prova;

/**
 *
 * @author moreira
 */
public class Carro implements Item
{
    private float preco;
    private String nome;

    public Carro(String nome, float preco) 
    {
        this.preco = preco;
        this.nome = nome;
    }

    public Carro() {}

    @Override
    public float getPreco() 
    {
        return this.preco;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }

    @Override
    public String getNome() 
    {
        return this.nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    
    
}
