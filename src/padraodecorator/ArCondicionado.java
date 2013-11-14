/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodecorator;

/**
 *
 * @author 20931088
 */
public class ArCondicionado extends Acessorio
{
    public ArCondicionado(Gol gol)
    {
        this.setGol(gol);
    }

    @Override
    double getCusto() {
        return 700 + this.getGol().getCusto();
    }

    @Override
    public String getDescricao() {
        return this.getGol().getDescricao() + " + ar condicionado ";
    }
    
}
