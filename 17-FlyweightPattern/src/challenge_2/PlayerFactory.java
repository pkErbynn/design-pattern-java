package challenge_2;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, IPlayer> kvp = new HashMap<>();

    public static IPlayer getPlayer(String type) {
        IPlayer player = null;

        if (kvp.containsKey(type)) {
            player = kvp.get(type);
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

            kvp.put(type, player);
        }

        return player;
    }
}
