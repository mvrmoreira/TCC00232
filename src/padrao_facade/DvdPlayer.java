/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_facade;

/**
 *
 * @author 10831011
 */
public class DvdPlayer 
{
    public void turnOn()
    {
        System.out.println("dvd player turned on");
    }
    public void turnOff()
    {
        System.out.println("dvd player turned off");
    }
    
    public void injectDisc()
    {
        System.out.println("the disc was inject");        
    }
    
    public void play()
    {
        System.out.println("the dvd is playing");         
    }
}
