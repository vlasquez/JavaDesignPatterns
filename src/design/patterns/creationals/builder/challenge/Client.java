package design.patterns.creationals.builder.challenge;

import design.patterns.creationals.builder.challenge.product.Meal;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("VegMeal");
        vegMeal.showItems();

        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("NonVegMeal");
        nonVegMeal.showItems();
    }
}
