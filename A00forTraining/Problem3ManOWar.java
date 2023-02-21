package A00forTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShipList = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShipList = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int maximumHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] separateCommand = command.split("\\s+");


            if (command.contains("Fire")) {
                int indexFire = Integer.parseInt(separateCommand[1]);
                int fireDamage = Integer.parseInt(separateCommand[2]);

                if (indexFire >= 0 && indexFire < warShipList.size()) {
                    int fireSection = warShipList.get(indexFire);
                    if (fireSection - fireDamage <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    } else {
                        warShipList.set(indexFire, fireSection - fireDamage);
                    }
                }


            } else if (command.contains("Defend")) {
                int startIndex = Integer.parseInt(separateCommand[1]);
                int endIndex = Integer.parseInt(separateCommand[2]);
                int defendDamage = Integer.parseInt(separateCommand[3]);

                if (startIndex >= 0 && startIndex < pirateShipList.size() && endIndex >= 0 && endIndex < pirateShipList.size()) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentPirateShipSection = pirateShipList.get(i);
                        if (currentPirateShipSection - defendDamage <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        } else {
                            pirateShipList.set(i, currentPirateShipSection - defendDamage);
                        }
                    }
                }


            } else if (command.contains("Repair")) {
                int repairIndex = Integer.parseInt(separateCommand[1]);
                int addedHealth = Integer.parseInt(separateCommand[2]);

                if (repairIndex >= 0 && repairIndex < pirateShipList.size()) {
                    int healthSection = pirateShipList.get(repairIndex);
                    if (healthSection + addedHealth <= maximumHealth) {
                        pirateShipList.set(repairIndex, healthSection + addedHealth);
                    } else {
                        pirateShipList.set(repairIndex, maximumHealth);
                    }

                }


            } else if (command.contains("Status")) {
                int sectionToRepare = 0;
                for (int i = 0; i < pirateShipList.size(); i++) {
                    int currentSection = pirateShipList.get(i);
                    double percent = ((1.0 * currentSection / maximumHealth) * 100);
                    if (20 > percent) {
                        sectionToRepare++;

                    }


                }
                System.out.printf("%d sections need repair.%n", sectionToRepare);


            }


            command = scanner.nextLine();
        }
        int pirateSum = 0;
        for (int i = 0; i < pirateShipList.size(); i++) {
            pirateSum += pirateShipList.get(i);
        }
        int warSum = 0;
        for (int i = 0; i < warShipList.size(); i++) {
            warSum += warShipList.get(i);
        }
        System.out.printf("Pirate ship status: %d%n", pirateSum);
        System.out.printf("Warship status: %d%n", warSum);

    }
}
