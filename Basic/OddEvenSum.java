import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sum1 = sum1 + currentNum;
            } else {
                sum2 = sum2 + currentNum;
            }

        } if (sum1 == sum2) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum1);
        } else  {
            int diff = Math.abs(sum1 - sum2);
            System.out.println ("No");
            System.out.printf("Diff = %d", diff);

        }

    }
}
