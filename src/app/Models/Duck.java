package app.Models;

import app.Interfaces.Ducks.IFlyBehavior;
import app.Interfaces.Ducks.IQuackBehavior;

/**
 * Duck
 */
public abstract class Duck {

    protected IQuackBehavior quackBehavior;
    protected IFlyBehavior flyBehavior;

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}