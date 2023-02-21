package A00MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class First03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itemList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        int movesCount = 0;


        while (!command.equals("end")) {
            String[] commandContains = command.split("\\s+");
            int firstIndex = Integer.parseInt(commandContains[0]);
            int secondIndex = Integer.parseInt(commandContains[1]);
            movesCount++;

            if (firstIndex == secondIndex || firstIndex < 0 || secondIndex < 0
                    || firstIndex > itemList.size() - 1 || secondIndex > itemList.size() - 1) {
                System.out.println("Invalid input! Adding additional elements to the board");
                itemList.add(itemList.size() / 2, String.format("-%da", movesCount));
                itemList.add(itemList.size() / 2, String.format("-%da", movesCount));


            } else {

                if (itemList.get(firstIndex).equals(itemList.get(secondIndex))) {

                    System.out.printf("Congrats! You have found matching elements - %s!%n", itemList.get(firstIndex));
                    String firstRemove = itemList.get(firstIndex);
                    String secondRemove = itemList.get(secondIndex);
                    itemList.remove(firstRemove);
                    itemList.remove(secondRemove);

                } else {
                    System.out.println("Try again!");
                }


            }

            if (itemList.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", movesCount);
                return;
            }


            command = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(itemList.toString().replaceAll("[\\[\\],]", ""));

    }
}
