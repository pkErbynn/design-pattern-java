package challenge_2;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, IPlayer> playersByTypes = new HashMap<>();

    public static IPlayer getPlayer(String type) {
        IPlayer player = null;

        // get existing player
        // otherwise create player and cache if player not exist already

        if (playersByTypes.containsKey(type)) {
            player = playersByTypes.get(type);
        }
        else {
            switch (type) {
                case "Terrorist":
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Invalid player");
            }

            playersByTypes.put(type, player);
        }

        return player;  // returned to set other dynamic state like weapon
    }
}
