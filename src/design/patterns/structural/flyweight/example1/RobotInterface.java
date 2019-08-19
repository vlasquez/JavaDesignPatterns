package design.patterns.structural.flyweight.example1;

public interface RobotInterface {
    void print();
}

class SmallRobot implements RobotInterface{
    @Override
    public void print() {
        System.out.println("This is a small robot");
    }
}


class LargeRobot implements RobotInterface{
    @Override
    public void print() {
        System.out.println("This is a large robot");
    }
}

