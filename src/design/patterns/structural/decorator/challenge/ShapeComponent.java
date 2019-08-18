package design.patterns.structural.decorator.challenge;

public interface ShapeComponent {

    void draw();
}

class Rectangle implements ShapeComponent {
    @Override
    public void draw() {
        System.out.println("Im printing a Rectangle - ConcreteRectangleShape");
    }
}

class Circle implements ShapeComponent {
    @Override
    public void draw() {
        System.out.println("Im printing a Circle - ConcreteCircleShape");
    }
}


