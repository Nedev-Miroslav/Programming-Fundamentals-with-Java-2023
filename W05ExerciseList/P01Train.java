package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] separateCommand = command.split(" ");
            if (command.contains("Add")) {
                int wagonAdd = Integer.parseInt(separateCommand[1]);
                wagons.add(wagonAdd);
            } else {
                int passengers = Integer.parseInt(separateCommand[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (passengers + wagons.get(i) <= capacity) {
                        wagons.set(i, passengers + wagons.get(i));
                        break;
                    } else {
                        continue;
                    }


                }

            }


            command = scanner.nextLine();
        }


        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));


    }
}
