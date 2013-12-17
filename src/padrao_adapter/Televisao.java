/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_adapter;

/**
 *
 * @author 10831011
 */
public class Televisao 
{
    private ITomadaBR tomadaBR;
    
    public Televisao(ITomadaBR tomadaBR)
    {
        this.tomadaBR = tomadaBR;
    }
    
    public void ligaTV()
    {
        tomadaBR.plugaBR();
    }
    
}
