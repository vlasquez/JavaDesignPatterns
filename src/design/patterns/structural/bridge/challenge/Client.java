package design.patterns.structural.bridge.challenge;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** BRIDGE PATTERN ***");

        System.out.println("\nColoring Triangle");
        IColor green = new Green();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        System.out.println("\nColoring Rectangle");
        IColor red = new Red();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 10);

    }
}
