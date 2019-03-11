package design.principles.solid.interfaceSegregation.example1;

public class Square implements IShape,IManageShape {
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}
