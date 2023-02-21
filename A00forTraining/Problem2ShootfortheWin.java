package A00forTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2ShootfortheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int shootCount = 0;
        while (!command.equals("End")) {
            int shoot = Integer.parseInt(command);

            if (shoot >= 0 && shoot < targetList.size()) {

                if (targetList.get(shoot) >= 0) {
                    shootCount++;
                    int currentShootIndex = targetList.get(shoot);
                    targetList.set(shoot, -1);
                    for (int i = 0; i < targetList.size(); i++) {

                        if (currentShootIndex < targetList.get(i) && targetList.get(i) >= 0) {
                            targetList.set(i, targetList.get(i) - currentShootIndex);


                        } else if (currentShootIndex >= targetList.get(i) && targetList.get(i) >= 0) {
                            targetList.set(i, targetList.get(i) + currentShootIndex);


                        }

                    }

                }

            }


            command = scanner.nextLine();
        }


        System.out.printf("Shot targets: %d -> ", shootCount);
        System.out.println(targetList.toString().replaceAll("[\\[\\],]", ""));

    }
}
