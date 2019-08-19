package design.patterns.structural.flyweight.example2_with_extrinsic_data;

import java.util.Random;

public class Client {

    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");
        RobotInterface robotInterface;

        for (int i = 0; i < 2; i++) {
            robotInterface = robotFactory.getRobotFactory("King");
            robotInterface.setColor(getRandomColor());
            robotInterface.print();
        }

        int NumOfDistinctRobots = robotFactory.totalObjectsCreated();

        System.out.println("\nDistinct Robot objects created till now = " + NumOfDistinctRobots);

        for (int i = 0; i < 5; i++) {
            robotInterface = robotFactory.getRobotFactory("Queen");
            robotInterface.setColor(getRandomColor());
            robotInterface.print();
        }

        NumOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\nFinally number of Distinct Robot objects created = " + NumOfDistinctRobots);


    }

    private static String getRandomColor() {
        Random r = new Random();

        int randomInt = r.nextInt(20);
        if (randomInt % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }


}
