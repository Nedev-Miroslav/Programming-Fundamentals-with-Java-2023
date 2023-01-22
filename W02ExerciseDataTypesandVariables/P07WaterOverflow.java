package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tankVolume = 255;
        int addLiters = 0;
        for (int i = 1; i <= n ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if(tankVolume >= liters) {
                tankVolume = tankVolume - liters;
                addLiters = addLiters + liters;
            } else {
                System.out.println("Insufficient capacity!");

            }



        }

        System.out.println(addLiters);
    }
}
