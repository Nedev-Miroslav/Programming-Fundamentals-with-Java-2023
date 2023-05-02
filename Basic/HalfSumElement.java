import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 1; i <= num ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

            if (currentNum > maxSum) {
                maxSum = currentNum;
            }

        } int finalSum = sum - maxSum;

        if (finalSum == maxSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxSum);
        } else {
            int diff = Math.abs(maxSum - finalSum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);

        }

    }
}
