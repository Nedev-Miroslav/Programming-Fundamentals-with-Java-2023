package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int startPower = powerN;
        int countOfPokes = 0;

        while (powerN >= distanceM) {
            powerN = powerN - distanceM;
            countOfPokes++;

            if (startPower / 2  == powerN) {
                if (exhaustionFactorY != 0) {
                    powerN = powerN / exhaustionFactorY;
                }
            }


        }

        System.out.println(powerN);
        System.out.println(countOfPokes);
    }
}
