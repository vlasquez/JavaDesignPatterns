package design.patterns.creationals.prototype.example.shape;

import design.patterns.creationals.prototype.example.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Shapes";
    }

    @Override
    public void draw() {
        System.out.println("Inside Shapes::draw() method");
    }


}
