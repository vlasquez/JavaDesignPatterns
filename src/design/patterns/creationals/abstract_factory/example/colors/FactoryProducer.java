package design.patterns.creationals.abstract_factory.colors;

import design.patterns.creationals.abstract_factory.AbstractFactory;
import design.patterns.creationals.abstract_factory.ColorFactory;
import design.patterns.creationals.abstract_factory.ShapeFactory;

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
