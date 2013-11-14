/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostrategy;

/**
 *
 * @author 20931088
 */
abstract public class Duck 
{
    protected FlyBehavior flyObj;
    protected QuackBehavior quackObj;
    
    public String performFly()
    {
        return this.flyObj.fly();
    }
    
    public String performQuack()
    {
        return this.quackObj.quack();
    }
    
    abstract public void display();
}