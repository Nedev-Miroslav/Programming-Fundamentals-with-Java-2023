package A00MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class Second02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initPassengers = Integer.parseInt(scanner.nextLine());
        int [] wagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int passengers = initPassengers;
        for (int i = 0; i < wagons.length; i++) {
            for (int j = 1; j <= 4; j++) {
                if (wagons[i] < 4) {
                    wagons[i]++;
                    passengers--;
                    if (passengers == 0) {
                        if (wagons[wagons.length - 1] == 4) {
                            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]", ""));
                        } else {
                            System.out.println("The lift has empty spots!");
                            System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]", ""));
                        } return;
                    }


                } else {
                    continue;
                }


            }
        }


                System.out.printf("There isn't enough space! %d people in a queue!%n", passengers);
                System.out.println(Arrays.toString(wagons).replaceAll("[\\[\\],]", ""));



    }
}
