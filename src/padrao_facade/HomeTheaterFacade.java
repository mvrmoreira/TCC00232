/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_facade;

/**
 *
 * @author 10831011
 */
public class HomeTheaterFacade 
{
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, TheaterLights lights, PopcornPopper popper) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.popper = popper;
    }

    public Amplifier getAmp() {
        return amp;
    }

    public void setAmp(Amplifier amp) {
        this.amp = amp;
    }

    public DvdPlayer getDvd() {
        return dvd;
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

    public TheaterLights getLights() {
        return lights;
    }

    public void setLights(TheaterLights lights) {
        this.lights = lights;
    }

    public PopcornPopper getPopper() {
        return popper;
    }

    public void setPopper(PopcornPopper popper) {
        this.popper = popper;
    }
    
    public void startMovie()
    {        
        System.out.println("The movie is starting...");
        
        this.getPopper().pop();
        this.getDvd().turnOn();
        this.getDvd().injectDisc();
        this.getProjector().turnOn();
        this.getAmp().turnOn();
        this.getLights().turnOff();
        this.getDvd().play();
    }
    
    public void finishMovie()
    {
        System.out.println("The movie is finishing...");
        
        this.getLights().turnOn();
        this.getDvd().turnOff();
        this.getProjector().turnOff();
        this.getAmp().turnOff();
    }
}
