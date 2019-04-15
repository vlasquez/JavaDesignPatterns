package design.patterns.creationals.abstract_factory.example.colors;

import design.patterns.creationals.abstract_factory.example.AbstractFactory;
import design.patterns.creationals.abstract_factory.example.ColorFactory;
import design.patterns.creationals.abstract_factory.example.ShapeFactory;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
 class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
