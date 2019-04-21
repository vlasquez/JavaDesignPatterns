package design.patterns.creationals.builder.challenge;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Director {
    MealBuilder builder;

    public void construct(MealBuilder builder) {
        this.builder = builder;
        builder.buildBurger();
        builder.buildDrink();
    }
}
