/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_adapter;

/**
 *
 * @author 10831011
 */
public class TomadaBR implements ITomadaBR
{

    @Override
    public void plugaBR() 
    {
        System.out.println("Plugou BR!");
    }
    
}
