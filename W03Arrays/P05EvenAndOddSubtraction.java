package W03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String lineInput = scanner.nextLine();

        int[] numberArr = Arrays.stream(lineInput.split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < numberArr.length; i++) {
            int curentNum = numberArr[i];
            if (curentNum % 2 == 0) {
                evenSum = evenSum + curentNum;
            } else {
                oddSum = oddSum + curentNum;
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);

    }
}
