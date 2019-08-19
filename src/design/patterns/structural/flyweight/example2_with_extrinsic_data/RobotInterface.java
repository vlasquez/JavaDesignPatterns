
package design.patterns.structural.flyweight.example2_with_extrinsic_data;

public interface RobotInterface {
    void print();

    void setColor(String colorOfRobot);
}


class Robot implements RobotInterface {
    private String robotType;
    private String colorOfRobot;

    Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + colorOfRobot + " color");
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}

