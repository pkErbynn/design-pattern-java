package challenge_2;

// Counter Strike simulation with have 2 player types - either terrorists and counter terrorists
// Terrorists task is to plant bomb.....intrinsic data
// Counter terrorists task is to diffuse bomb.....intrinsic data since always the same for counter terrorists
// Players can be of different color, suit and have diff weapons.....extrinsic data since it varies
// N number of players can play
// but we don't wanna be creating n number of objects thus using the flyweight pattern

import java.util.Random;

public class CounterStrike {
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Gut Knife", "Sniper", "Pistol"};

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            IPlayer player = PlayerFactory.getPlayer(playerType[1]);    // gets players from cache once one is created
            player.assignWeapon(getRandomWeapon());     // set weapon randomly
            player.mission();
        }
    }

    public static String getRandomWeapon() {
        int randInt = new Random().nextInt(weapons.length);
        return weapons[randInt];
    }
}
