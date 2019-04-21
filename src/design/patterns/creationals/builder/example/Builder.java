package design.patterns.creationals.builder.example;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-20
 **/
public interface Builder {

    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}
