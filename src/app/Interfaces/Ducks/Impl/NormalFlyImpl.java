package app.Interfaces.Ducks.Impl;

import app.Interfaces.Ducks.IFlyBehavior;

/**
 * NormalFlyImpl
 */
public class NormalFlyImpl implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("Normal flying!");
    }
}