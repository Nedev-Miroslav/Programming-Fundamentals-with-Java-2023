package W03ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PM06LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];
        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int ladyBugsIndex : ladyBugsIndexes) {
            if (ladyBugsIndex >= 0 && ladyBugsIndex <= field.length - 1) {
                field[ladyBugsIndex] = 1;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokes = command.split(" ");
            int index = Integer.parseInt(tokes[0]);
            String direction = tokes[1];
            int flyLength = Integer.parseInt(tokes[2]);


            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                field[index] = 0;
                if (direction.equals("right")) {
                    index += flyLength;
                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flyLength;
                    }
                    if (index <= field.length - 1) {
                        field[index] = 1;
                    }


                } else if (direction.equals("left")) {
                    index -= flyLength;
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }

                }

            }

            command = scanner.nextLine();
        }
        for (int number : field) {
            System.out.print(number + " ");
        }

    }
}
