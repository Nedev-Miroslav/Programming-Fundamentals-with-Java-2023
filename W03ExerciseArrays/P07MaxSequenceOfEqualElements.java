package W03ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxCount = 0;
        int digit = 0;
        int count = 1;

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            if (i == numbersArr.length - 1) {
                break;
            }
            if(currentNum == numbersArr[i + 1]) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                    digit = numbersArr[i];
                }
            } else
                count = 1;
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }



    }
}
