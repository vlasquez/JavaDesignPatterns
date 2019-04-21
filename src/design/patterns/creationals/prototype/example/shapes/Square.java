package design.patterns.creationals.prototype.example.shapes;

import design.patterns.creationals.prototype.example.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
