package app.Interfaces.Ducks.Impl;

import app.Interfaces.Ducks.IQuackBehavior;

/**
 * NormalQuackImpl
 */
public class NormalQuackImpl implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}