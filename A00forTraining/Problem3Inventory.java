package A00forTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> itemList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] separateCommand = command.split(" - ");

            if (command.contains("Collect")) {
                String collectItem = separateCommand[1];
                if (!itemList.contains(collectItem)) {
                    itemList.add(collectItem);
                }


            } else if (command.contains("Drop")) {
                String dropItem = separateCommand[1];
                if (itemList.contains(dropItem)) {
                    itemList.remove(dropItem);
                }

            } else if (command.contains("Combine Items")) {
                String[] items = separateCommand[1].split(":");
                String oldItem = items[0];
                String newItem = items[1];
                if (itemList.contains(oldItem)) {
                    int index = itemList.indexOf(oldItem);
                    itemList.add(index + 1, newItem);
                }


            } else if (command.contains("Renew")) {
                String renewItem = separateCommand[1];
                if (itemList.contains(renewItem)) {
                    itemList.remove(renewItem);
                    itemList.add(renewItem);
                }


            }


            command = scanner.nextLine();
        }

        System.out.println(itemList.toString().replaceAll("[\\[\\]]", ""));


    }
}
