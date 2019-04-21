package design.patterns.creationals.builder.challenge;

import design.patterns.creationals.builder.challenge.product.Meal;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public interface MealBuilder {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}

class VegMealBuilder implements MealBuilder {

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}

class NonVegMealBuilder implements MealBuilder {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}