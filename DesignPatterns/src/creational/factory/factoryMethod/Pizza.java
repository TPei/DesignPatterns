package creational.factory.factoryMethod;

import java.util.ArrayList;

/**
 * Created by thomas on 08/03/15.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding Toppings: ");
        for (Object topping : toppings) {
            System.out.println("    " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the Pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place Pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
