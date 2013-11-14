/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodecorator;

/**
 *
 * @author 20931088
 */
public abstract class Acessorio extends Gol
{
    private Gol gol;
    
    @Override
    public abstract String getDescricao();

    public Gol getGol() {
        return gol;
    }

    public void setGol(Gol gol) {
        this.gol = gol;
    }
}
