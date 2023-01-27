package W03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput1 = scanner.nextLine();
        String lineInput2 = scanner.nextLine();

        int[] numbersArr1 = Arrays.stream(lineInput1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersArr2 = Arrays.stream(lineInput2.split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int index = 0;
        boolean isIdentical = true;

        for (int i = 0; i < numbersArr1.length; i++) {
            int currentNum1 = numbersArr1[i];
            int currentNum2 = numbersArr2[i];

            if (currentNum1 == currentNum2) {
                sum = sum + currentNum1;
            } else {
                index = i;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }

    }
}
