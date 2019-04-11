package design.patterns.creationals.abstract_factory;

import design.patterns.creationals.abstract_factory.colors.Color;
import design.patterns.creationals.abstract_factory.colors.Green;
import design.patterns.creationals.abstract_factory.colors.Red;
import design.patterns.creationals.abstract_factory.shapes.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.isEmpty()) {
            return null;
        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}
