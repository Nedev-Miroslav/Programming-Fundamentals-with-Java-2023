package W03ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int[] numbersArr = Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            int inNum = 0;
            boolean isTop = true;
            for (int j = i + 1; j < numbersArr.length; j++) {
                inNum = numbersArr[j];
                if (currentNum > inNum) {
                    continue;
                } else {
                    isTop = false;

                }

            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }

        }

    }
}
