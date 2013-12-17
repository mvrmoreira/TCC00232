
package prova;

/**
 *
 * @author moreira
 */
public class Moto implements Item
{
    private String nome;
    private float preco;

    public Moto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Moto() {}

    @Override
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public float getPreco() 
    {
        return preco;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }    
}
