/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_adapter;

/**
 *
 * @author 10831011
 */
public class TomadaUS implements ITomadaUS
{
    @Override
    public void plugaUS() 
    {
        System.out.println("Plugou US!");        
    }    
}
