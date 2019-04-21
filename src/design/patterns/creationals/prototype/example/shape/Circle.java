package design.patterns.creationals.prototype.example.shape;

import design.patterns.creationals.prototype.example.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
