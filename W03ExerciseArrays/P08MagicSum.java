package W03ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr [i];

            for (int j = i + 1; j < numbersArr.length; j++) {
                int inNum = numbersArr[j];

                if (currentNum + inNum == magicNum) {
                    System.out.printf("%d %d%n", currentNum, inNum);
                }



            }



        }

    }
}
