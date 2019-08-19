package design.patterns.structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> robots = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated() {
        return robots.size();
    }

    public RobotInterface getRobotFactory(String robotCategory) throws Exception {
        RobotInterface actualRobot = null;
        if (robots.containsKey(robotCategory)) {
            actualRobot = robots.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have a Small Robot.  So we are creating a Small Robot now");
                    actualRobot = new SmallRobot();
                    robots.put("small", actualRobot);
                    break;
                case "large":
                    System.out.println("We do not have Large Robot. So we are creating a Large Robot now .");
                    actualRobot = new LargeRobot();
                    robots.put("large", actualRobot);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only Small and Large Robots");
            }
        }
        return actualRobot;
    }
}

