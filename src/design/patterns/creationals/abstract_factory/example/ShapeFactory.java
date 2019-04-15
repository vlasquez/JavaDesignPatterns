package design.patterns.creationals.abstract_factory.example;

import design.patterns.creationals.abstract_factory.example.colors.Color;
import design.patterns.creationals.abstract_factory.example.shapes.Rectangle;
import design.patterns.creationals.abstract_factory.example.shapes.Shape;
import design.patterns.creationals.abstract_factory.example.shapes.Square;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.isEmpty()) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
