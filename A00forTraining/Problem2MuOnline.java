package A00forTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dungeonRoom = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoin = 0;


        for (int i = 0; i < dungeonRoom.length; i++) {
            String [] currentRoom = dungeonRoom[i].split("\\s+");
            String command = currentRoom[0];
            int amount = Integer.parseInt(currentRoom[1]);
            
            
            if(command.equals("potion")) {
                if(health + amount > 100) {
                  amount = 100 - health;
                    health = 100;
                } else {
                    health += amount;
                }
                System.out.printf("You healed for %d hp.%n", amount);
                System.out.printf("Current health: %d hp.%n", health);

                
            } else if (command.equals("chest")) {
                bitcoin += amount;
                System.out.printf("You found %d bitcoins.%n", amount);


            } else {
                health -= amount;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);

                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    return;
                }



            }


        }

        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d%n", bitcoin, health);




    }
}
