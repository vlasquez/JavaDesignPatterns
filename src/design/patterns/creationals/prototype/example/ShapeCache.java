package design.patterns.creationals.prototype.example;

import design.patterns.creationals.prototype.example.shapes.Circle;
import design.patterns.creationals.prototype.example.shapes.Rectangle;
import design.patterns.creationals.prototype.example.shapes.Square;

import java.util.Hashtable;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCached() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
