/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author 20931088
 */
public class EggsDuck extends Duck
{    
    public EggsDuck() {
        this.flyObj = new FlyWithWings();
        this.quackObj = new Quack();
    }

    @Override
    public void display() {
        System.out.println(this.performFly());
        System.out.println(this.performQuack());
    }
}
