package A00forTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> neighborhoodList = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int cupidPossition = 0;
        while (!command.equals("Love!")) {
            String[] separateCommand = command.split("\\s+");
            int jumpingIndex = Integer.parseInt(separateCommand[1]);
            cupidPossition += jumpingIndex;

            if (cupidPossition <= neighborhoodList.size() - 1) {
                neighborhoodList.set(cupidPossition, neighborhoodList.get(cupidPossition) - 2);
                if (neighborhoodList.get(cupidPossition) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", cupidPossition);

                } else if (neighborhoodList.get(cupidPossition) < 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", cupidPossition);

                }

            } else {
                cupidPossition = 0;
                neighborhoodList.set(cupidPossition, neighborhoodList.get(cupidPossition) - 2);
                if (neighborhoodList.get(cupidPossition) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", cupidPossition);

                } else if (neighborhoodList.get(cupidPossition) < 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", cupidPossition);

                }


            }


            command = scanner.nextLine();
        }
        int count = 0;
        for (int i = 0; i < neighborhoodList.size(); i++) {
            if (neighborhoodList.get(i) > 0) {
                count++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", cupidPossition);
        if (count > 0) {
            System.out.printf("Cupid has failed %d places.%n", count);
        } else {
            System.out.println("Mission was successful.");
        }


    }
}
