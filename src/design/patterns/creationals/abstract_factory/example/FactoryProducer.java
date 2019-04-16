package design.patterns.creationals.abstract_factory.example;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
