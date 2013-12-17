/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_adapter;

/**
 *
 * @author 10831011
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TomadaUS tomada = new TomadaUS();
        
        AdaptadorUniversal adaptador = new AdaptadorUniversal(tomada);        
        
        Televisao tv = new Televisao(adaptador);
        tv.ligaTV();
    }
}
