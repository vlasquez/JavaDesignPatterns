package design.principles.solid.openClose;

public class Rectangle implements IShape {

    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}


