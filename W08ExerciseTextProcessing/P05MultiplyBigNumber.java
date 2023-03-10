package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNum = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        int mind = 0;
        for (int i = bigNum.length() - 1; i >= 0; i--) {
            String strDigit = String.valueOf(bigNum.charAt(i));
            int digit = Integer.parseInt(strDigit);
            int multiply = digit * num + mind;

            if (i == 0) {
                sb.insert(0, multiply);
            } else {
                int digitToAdd = multiply % 10;
                mind = multiply / 10;
                sb.insert(0, digitToAdd);
            }

        }
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }

        System.out.println(sb);

    }
}
