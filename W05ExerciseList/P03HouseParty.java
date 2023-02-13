package W05ExerciseList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < countOfCommands; i++) {
            String guestNameComeOrNot = scanner.nextLine();
            String[] command = guestNameComeOrNot.split(" ");


            if (command.length == 3) {
                String name = command[0];
                if (guestList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                    continue;
                }
                guestList.add(name);

            } else if (command.length == 4) {
                String name = command[0];
                if (!guestList.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                }
                guestList.remove(name);


            }


        }


        System.out.println(String.join(System.lineSeparator(), guestList));


    }
}
