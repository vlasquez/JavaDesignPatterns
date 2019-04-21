package design.patterns.creationals.builder.example;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public class Director {

    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
    }
}
