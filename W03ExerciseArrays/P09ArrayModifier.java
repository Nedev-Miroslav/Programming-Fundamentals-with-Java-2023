package W03ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];

                numbersArr[index1] = element2;
                numbersArr[index2] = element1;


            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];

                int multiplication = element1 * element2;

                numbersArr[index1] = multiplication;


            } else if (command.equals("decrease")) {

                for (int i = 0; i < numbersArr.length; i++) {
                    numbersArr[i]--;
                }
            }

            command = scanner.nextLine();
        }

//        for (int i = 0; i < numbersArr.length; i++) {
//            int currentPrintNum = numbersArr[i];
//
//            if (i == numbersArr.length - 1) {
//                System.out.println(currentPrintNum);
//            } else {
//                System.out.printf("%d, ", currentPrintNum);
//            }
//      }

        System.out.println(Arrays.toString(numbersArr). replace("[", " "). replace("]", " "));
    }
}
