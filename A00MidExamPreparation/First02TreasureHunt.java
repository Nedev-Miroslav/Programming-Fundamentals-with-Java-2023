package A00MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class First02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> chestLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("Yohoho!")) {
            String[] commandContains = command.split(" ");
            String currentCommand = commandContains[0];


            switch (currentCommand) {
                case "Loot":
                    List <String> lootItem = new ArrayList<>();
                    for (int i = 1; i < commandContains.length; i++) {
                        lootItem.add(i - 1, commandContains[i]);

                    }
                    for (int i = 0; i < lootItem.size(); i++) {
                        String currentLootItem = lootItem.get(i);
                        if (!chestLoot.contains(currentLootItem)) {
                            chestLoot.add(0, currentLootItem);
                        }

                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandContains[1]);
                    if (index >= 0 && index < chestLoot.size()) {
                        String removedItem = chestLoot.get(index);
                        chestLoot.remove(index);
                        chestLoot.add(removedItem);
                    }

                    break;
                case "Steal":
                    int countOfSteals = Integer.parseInt(commandContains[1]);
                    int startIndex = chestLoot.size() - countOfSteals;
                    List<String> stolenItem = new ArrayList<>();
                    if (startIndex > 0) {
                        for (int i = startIndex; i <= chestLoot.size() - 1; i++) {
                            stolenItem.add(chestLoot.get(i));
                            chestLoot.remove(i--);
                        }



                    } else {
                        for (int i = 0; i <= chestLoot.size() - 1; i++) {
                            stolenItem.add(chestLoot.get(i));
                            chestLoot.remove(i--);
                        }


                    }

                    System.out.println(String.join(", ",stolenItem));
                    break;

            }


            command = scanner.nextLine();
        }


        if (chestLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0.0;
            for (String s : chestLoot) {
                sum += s.length();
            }
            double result = sum / chestLoot.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", result);
        }


    }
}
