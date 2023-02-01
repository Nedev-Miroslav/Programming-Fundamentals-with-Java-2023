package W03ExerciseArrays;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] treasureChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandContains = command.split(" ");

            switch (commandContains[0]) {
                case "Loot":
                    for (int i = 1; i < commandContains.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandContains[i].equals(treasureChest[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = commandContains[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandContains[1]);

                    if (position <= treasureChest.length - 1 && position >= 0) {
                        String dropItem = treasureChest[position];
                        for (int i = position; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;

                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(commandContains[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < treasureChest.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {
                            System.out.print(treasureChest[treasureChest.length - numberOfStealingItems + i]);
                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length - numberOfStealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;

                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;

            }

            command = scanner.nextLine();
        }

        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / treasureChest.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}