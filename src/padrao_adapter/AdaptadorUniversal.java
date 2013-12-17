/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_adapter;

/**
 *
 * @author 10831011
 */
public class AdaptadorUniversal implements ITomadaBR, ITomadaUS
{
    private TomadaBR tomadaBR;
    private TomadaUS tomadaUS;
    
    public AdaptadorUniversal(TomadaBR tomadaBR)
    {
        this.tomadaBR = tomadaBR;
    }
    
    public AdaptadorUniversal(TomadaUS tomadaUS)
    {
        this.tomadaUS = tomadaUS;
    }

    @Override
    public void plugaBR() 
    {
        this.tomadaUS.plugaUS();
    }

    @Override
    public void plugaUS() 
    {      
        this.tomadaBR.plugaBR();
    }
    
}
