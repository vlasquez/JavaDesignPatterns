package design.patterns.creationals.factory_method.concrete_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public class ShapeFactory {

    // user getShape method to get object of type shape

    public Shape getShape(String shapeType) {
        if (shapeType.isEmpty()) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
