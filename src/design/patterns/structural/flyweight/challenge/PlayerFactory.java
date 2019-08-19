package design.patterns.structural.flyweight.challenge;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private Map<String, PlayerInterface> players = new HashMap<>();

    int totalObjectsCreated() {
        return players.size();
    }

    PlayerInterface getPlayer(String playerTask) throws Exception {

        PlayerInterface actualPlayer;
        if (players.containsKey(playerTask)) {
            actualPlayer = players.get(playerTask);
        } else {
            switch (playerTask) {
                case "DIFFUSE BOMB":
                    System.out.println("Counter Terrorist Created");
                    actualPlayer = new CounterTerrorist("DIFFUSE BOMB");
                    players.put("DIFFUSE", actualPlayer);
                    break;
                case "PLANT BOMB":
                    System.out.println("Terrorist Created");
                    actualPlayer = new Terrorist("PLANT BOMB");
                    players.put("PLANT BOMB", actualPlayer);
                    break;
                default:
                    throw new Exception(" ");
            }
        }
        return actualPlayer;
    }
}
