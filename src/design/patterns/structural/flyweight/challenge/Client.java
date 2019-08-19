package design.patterns.structural.flyweight.challenge;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        PlayerFactory playerFactory = new PlayerFactory();
        System.out.println("\n***Flyweight Pattern Challenge***\n");
        PlayerInterface playerInterface;

        for (int i = 0; i < 2; i++) {
            playerInterface = playerFactory.getPlayer("DIFFUSE BOMB");
            playerInterface.setWeapon(getRandomWeapon());
            playerInterface.printPlayer();
        }

        int NumOfDistinctRobots = playerFactory.totalObjectsCreated();

        System.out.println("\nDistinct player objects created till now = " + NumOfDistinctRobots);

        for (int i = 0; i < 5; i++) {
            playerInterface = playerFactory.getPlayer("PLANT BOMB");
            playerInterface.setWeapon(getRandomWeapon());
            playerInterface.printPlayer();
        }

        NumOfDistinctRobots = playerFactory.totalObjectsCreated();
        System.out.println("\nFinally number of Distinct player objects created = " + NumOfDistinctRobots);


    }

    private static String getRandomWeapon() {
        String[] weapons = {"Gut Knife", "Desert Eagle", "AK-47", "Shotgun"};
        return weapons[new Random().nextInt(weapons.length)];
    }
}
