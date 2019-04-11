package design.patterns.creationals.abstract_factory;

import design.patterns.creationals.abstract_factory.colors.Color;
import design.patterns.creationals.abstract_factory.shapes.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
