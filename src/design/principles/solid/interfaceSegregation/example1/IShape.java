package design.principles.solid.interfaceSegregation.example1;

public interface IShape {
    public double area();

}

interface ISolidShape{

    public double volume();
}

interface IManageShape{
    public double calculate();
        }