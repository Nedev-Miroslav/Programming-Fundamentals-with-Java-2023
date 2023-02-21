package A00forTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Problem3MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] separateCommand = command.split("\\s+");

            if (command.contains("Shoot")) {
                int shootIndex = Integer.parseInt(separateCommand[1]);
                int power = Integer.parseInt(separateCommand[2]);
                if (shootIndex >= 0 && shootIndex < targetList.size()) {
                    if (targetList.get(shootIndex) - power > 0) {
                        targetList.set(shootIndex, targetList.get(shootIndex) - power);
                    } else if (targetList.get(shootIndex) - power <= 0) {
                        targetList.remove(shootIndex);

                    }


                }


            } else if (command.contains("Add")) {
                int addIndex = Integer.parseInt(separateCommand[1]);
                int value = Integer.parseInt(separateCommand[2]);
                if (addIndex >= 0 && addIndex < targetList.size()) {
                    targetList.add(addIndex, value);

                } else {
                    System.out.println("Invalid placement!");
                }


            } else if (command.contains("Strike")) {
                int strikeIndex = Integer.parseInt(separateCommand[1]);
                int radius = Integer.parseInt(separateCommand[2]);
                if (strikeIndex >= 0 && strikeIndex < targetList.size()) {

                    if (strikeIndex - radius >= 0 && strikeIndex + radius < targetList.size()) {
                        int startIndex = strikeIndex - radius;
                        int endIndex = strikeIndex + radius;
                        for (int i = startIndex; i <= endIndex; i++) {
                            targetList.remove(i--);
                            endIndex--;
                        }


                    } else {
                        System.out.println("Strike missed!");
                    }


                } else {
                    System.out.println("Strike missed!");
                }


            }


            command = scanner.nextLine();
        }


        System.out.println(targetList.toString().replace
                ("[", "").replace("]", "").replace(", ", "|"));


    }
}
