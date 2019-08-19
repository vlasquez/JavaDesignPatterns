package design.patterns.structural.flyweight.example1;

public class Client {

    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");
        RobotInterface robotInterface = robotFactory.getRobotFactory("small");
        robotInterface.print();


        for (int i = 0; i < 2; i++) {
            robotInterface = robotFactory.getRobotFactory("small");
            robotInterface.print();
        }

        int NumOfDistinctRobots = robotFactory.totalObjectsCreated();

        System.out.println("\nDistinct Robot objects created till now = " + NumOfDistinctRobots);

        for (int i = 0; i < 5; i++) {
            robotInterface = robotFactory.getRobotFactory("large");
            robotInterface.print();
        }

        NumOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nFinally number of Distinct Robot objects created = " + NumOfDistinctRobots);


    }

}
