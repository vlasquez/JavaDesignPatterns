package design.patterns.structural.decorator.challenge;

public abstract class ShapeDecorator implements ShapeComponent {
    private ShapeComponent shapeComponent;

    public void setComponent(ShapeComponent component) {
        this.shapeComponent = component;
    }

    @Override
    public void draw() {
        if (shapeComponent != null) {
            shapeComponent.draw();
        }
    }
}

class RedShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        super.draw();
        System.out.println("With border Red");
    }
}

class GreenShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        super.draw();
        System.out.println("With border Green");
    }
}
