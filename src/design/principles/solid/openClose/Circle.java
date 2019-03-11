package design.principles.solid.openClose;

public class Circle implements IShape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7)* radius* radius;
    }
}
