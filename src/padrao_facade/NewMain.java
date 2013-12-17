/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_facade;

/**
 *
 * @author 10831011
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new DvdPlayer(), new Projector(), new TheaterLights(), new PopcornPopper());
        homeTheater.startMovie();
        homeTheater.finishMovie();
        
    }
}
 