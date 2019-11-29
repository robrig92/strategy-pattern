package app.Interfaces.Ducks.Impl;

import app.Interfaces.Ducks.IQuackBehavior;

/**
 * MuteQuackImpl
 */
public class MuteQuackImpl implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("...");
    }
}