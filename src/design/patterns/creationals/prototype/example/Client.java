package design.patterns.creationals.prototype.example;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Client {

    public static void main(String[] args) {
        ShapeCache.loadCached();


        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());


        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());


        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
