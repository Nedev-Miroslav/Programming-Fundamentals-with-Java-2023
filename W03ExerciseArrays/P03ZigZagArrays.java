package W03ExerciseArrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] inputArr1 = new String[n];
        String[] inputArr2 = new String[n];

        for (int i = 1; i <= n; i++) {

            String[] input = scanner.nextLine().split(" ");

            if (i % 2 != 0) {
                inputArr1[i - 1] = input[0];
                inputArr2[i - 1] = input[1];
            } else {
                inputArr1[i - 1] = input[1];
                inputArr2[i - 1] = input[0];
            }
        }

        System.out.println(String.join(" ", inputArr1));
        System.out.println(String.join(" ", inputArr2));
    }
}
