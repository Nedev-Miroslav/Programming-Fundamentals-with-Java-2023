package A00MidExamPreparation;

import java.util.Scanner;

public class First01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int energy = initEnergy;
        int winBattles = 0;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (energy >= distance) {
                winBattles++;
                energy -= distance;

                if (winBattles % 3 == 0) {
                    energy += winBattles;

                }

            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", winBattles, energy);
                return;
            }


            command = scanner.nextLine();
        }



            System.out.printf("Won battles: %d. Energy left: %d", winBattles, energy);



    }
}
