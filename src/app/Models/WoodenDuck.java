package app.Models;

import app.Interfaces.Ducks.Impl.MuteQuackImpl;
import app.Interfaces.Ducks.Impl.NoFlyImpl;

/**
 * WoodenDuck
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        this.flyBehavior = new NoFlyImpl();
        this.quackBehavior = new MuteQuackImpl();
    }

    @Override
    public void display() {
        System.out.println("Lying in the water...");
    }
}