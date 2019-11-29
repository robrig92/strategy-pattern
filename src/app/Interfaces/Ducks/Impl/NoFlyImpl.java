package app.Interfaces.Ducks.Impl;

import app.Interfaces.Ducks.IFlyBehavior;

/**
 * NoFlyImpl
 */
public class NoFlyImpl implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("No flying...");
    }
}