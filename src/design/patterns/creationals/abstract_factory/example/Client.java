package design.patterns.creationals.abstract_factory.example;

import design.patterns.creationals.abstract_factory.example.colors.Color;
import design.patterns.creationals.abstract_factory.example.colors.FactoryProducer;
import design.patterns.creationals.abstract_factory.example.shapes.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-11
 **/
 class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();
    }
}
