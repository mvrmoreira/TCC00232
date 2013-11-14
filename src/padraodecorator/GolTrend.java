/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraodecorator;

/**
 *
 * @author 20931088
 */
public class GolTrend extends Gol
{
    public GolTrend() 
    {
        this.setDescricao("gol trend");
    }
    
    @Override
    double getCusto() {
        return 30000;
        
    }
    
}
