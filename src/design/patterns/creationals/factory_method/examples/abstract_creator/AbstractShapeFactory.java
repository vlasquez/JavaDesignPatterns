package design.patterns.creationals.factory_method.examples.abstract_creator;

/**
 * @autor Andrés Velasquez
 * @since 2019-04-08
 **/
public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

}

class RectangleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}