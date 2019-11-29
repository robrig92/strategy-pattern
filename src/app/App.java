package app;

import app.Interfaces.Ducks.Impl.NormalFlyImpl;
import app.Interfaces.Ducks.Impl.NormalQuackImpl;
import app.Models.Duck;
import app.Models.MarshallDuck;
import app.Models.WoodenDuck;

public class App {
    public static void main(String[] args) throws Exception {
        Duck duck = new MarshallDuck();

        System.out.println("Marshall duck:");
        System.out.println("---------------");
        duck.display();
        duck.performQuack();
        duck.performFly();
        Thread.sleep(2000);

        System.out.println();
        System.out.println("Someone:");
        System.out.println("---------------");
        System.out.println("Look there! it's a wooden duck!");
        Thread.sleep(1000);

        Duck woodenDuck = new WoodenDuck();

        System.out.println();
        System.out.println("Wooden duck:");
        System.out.println("---------------");
        woodenDuck.display();
        woodenDuck.performQuack();
        woodenDuck.performFly();
        Thread.sleep(3000);

        System.out.println();
        System.out.println("Someone:");
        System.out.println("---------------");
        System.out.println("It seems like that wooden duck doesn't do anything...");
        Thread.sleep(3000);

        System.out.println();
        System.out.println("Someone:");
        System.out.println("---------------");
        System.out.println("What's that, it's flying and quacking now!");
        Thread.sleep(1000);

        woodenDuck.setFlyBehavior(new NormalFlyImpl());
        woodenDuck.setQuackBehavior(new NormalQuackImpl());

        System.out.println();
        System.out.println("Wooden Duck:");
        System.out.println("---------------");
        woodenDuck.performQuack();
        woodenDuck.performFly();
    }
}