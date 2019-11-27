package app;

import app.Models.Duck;
import app.Models.MarshallDuck;

public class App {
    public static void main(String[] args) throws Exception {
        Duck duck = new MarshallDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
    }
}