/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author 20931088
 */
public class RubberDuck extends Duck
{
    public RubberDuck() {
        this.flyObj = new FlyNoWay();
        this.quackObj = new MuteQuack();
    }
    
    @Override
    public void display() {
        System.out.println(this.flyObj.fly());
        System.out.println(this.quackObj.quack());        
    }
    
}
