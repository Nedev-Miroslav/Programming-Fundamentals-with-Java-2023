package W03ExerciseArrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numberArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;
            numberArr[i] = currentNum;

        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", numberArr[i]);
        }
        System.out.printf("%n%d",sum);
    }
}
