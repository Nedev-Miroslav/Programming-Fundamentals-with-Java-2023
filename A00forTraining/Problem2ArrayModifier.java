package A00forTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] separateCommand = command.split(" ");

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(separateCommand[1]);
                int index2 = Integer.parseInt(separateCommand[2]);


                int firstElement = numberArr[index1];
                int secondElement = numberArr[index2];

                numberArr[index1] = secondElement;
                numberArr[index2] = firstElement;


            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(separateCommand[1]);
                int index2 = Integer.parseInt(separateCommand[2]);
                numberArr[index1] = numberArr[index1] * numberArr[index2];


            } else if (command.contains("decrease")) {
                for (int i = 0; i < numberArr.length; i++) {
                    numberArr[i] = numberArr[i] - 1;
                }


            }


            command = scanner.nextLine();

        }

        System.out.println(Arrays.toString(numberArr).replaceAll("[\\[\\]]", ""));


    }
}
