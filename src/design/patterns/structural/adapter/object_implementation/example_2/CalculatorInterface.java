package design.patterns.structural.adapter.object_implementation.example_2;


/**
 * @autor Andrés Velasquez
 * @since 2019-04-28
 **/
public interface CalculatorInterface {

    /**
     * target interface
     **/
    public double getArea(Rectangle r);
}

class Calculator implements CalculatorInterface {

    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}