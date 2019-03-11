package design.principles.solid.interfaceSegregation.example1;

public class Cube implements IShape,ISolidShape, IManageShape{

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area()+ this.volume();
    }
}

