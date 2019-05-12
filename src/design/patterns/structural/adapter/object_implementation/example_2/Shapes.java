package design.patterns.structural.adapter.object_implementation.example_2;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
class Rectangle {

    public double length;
    public double width;

}

class Triangle {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
