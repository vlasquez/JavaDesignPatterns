package design.patterns.creationals.builder.challenge.product;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/

import design.patterns.creationals.builder.challenge.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the product
 **/

public class Meal {

    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.print("Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
