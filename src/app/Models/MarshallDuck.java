package app.Models;

import app.Interfaces.Ducks.Impl.NormalFlyImpl;
import app.Interfaces.Ducks.Impl.NormalQuackImpl;

/**
 * MarshallDuck
 */
public class MarshallDuck extends Duck {

    public MarshallDuck() {
        flyBehavior = new NormalFlyImpl();
        quackBehavior = new NormalQuackImpl();
    }

    @Override
    public void display() {
        System.out.println("Just lying in the water");
    }
}