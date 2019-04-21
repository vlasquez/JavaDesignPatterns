package design.patterns.creationals.prototype.example.shapes;

import design.patterns.creationals.prototype.example.Shape;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-21
 **/
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }


}
