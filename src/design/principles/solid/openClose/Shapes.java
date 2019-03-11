package design.principles.solid.openClose;


/**
 * This design violates the Open Closed Principle
 */
class InvalidRectangle {

    public double length;
    public double width;


}

 class AreaCalculator{
public double calculateShapeArea(IShape shape){
    return shape.calculateArea();
}
}

 class InvalidCircle {
    public double radius;
}