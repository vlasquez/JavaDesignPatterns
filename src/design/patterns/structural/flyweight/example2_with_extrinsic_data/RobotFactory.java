package design.patterns.structural.flyweight.example2_with_extrinsic_data;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    private Map<String, RobotInterface> robots = new HashMap<>();

    int totalObjectsCreated() {
        return robots.size();
    }

    RobotInterface getRobotFactory(String robotType) throws Exception {
        RobotInterface actualRobot;
        if (robots.containsKey(robotType)) {
            actualRobot = robots.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have a King Robot.  So we are creating a King Robot now");
                    actualRobot = new Robot("King");
                    robots.put("King", actualRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now .");
                    actualRobot = new Robot("Queen");
                    robots.put("Queen", actualRobot);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only King and Queen Robots");
            }
        }
        return actualRobot;
    }
}

