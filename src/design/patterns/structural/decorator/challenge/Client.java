package design.patterns.structural.decorator.challenge;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Decorator pattern challenge***");
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator();
        greenShapeDecorator.setComponent(rectangle);
        greenShapeDecorator.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator();
        redShapeDecorator.setComponent(greenShapeDecorator);
        redShapeDecorator.draw();

        redShapeDecorator.setComponent(circle);
        redShapeDecorator.draw();
    }
}
