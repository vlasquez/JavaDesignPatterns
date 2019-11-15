package design.principles.solid.interfaceSegregation.example1;

public interface IShape {
    double area();
}

interface ISolidShape {
    double volume();
}

interface IManageShape {
    double calculate();
}