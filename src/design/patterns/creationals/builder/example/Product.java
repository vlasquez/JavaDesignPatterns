package design.patterns.creationals.builder.example;

import java.util.LinkedList;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Product {

    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n Product completed as below");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
