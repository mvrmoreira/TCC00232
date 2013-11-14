/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodecorator;

/**
 *
 * @author 20931088
 */
public class GolPower extends Gol
{
    public GolPower()
    {
        this.setDescricao("gol power");
    }
    
    @Override
    double getCusto() {
        return 40000;
    }
    
}
