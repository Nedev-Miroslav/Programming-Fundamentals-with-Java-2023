import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 1; i <= num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + currentNum;



        }

        for (int i = 1; i <= num; i++) {
            int currentNum2 = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + currentNum2;

        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            int finalSum = Math.abs(sum1 - sum2);
            System.out.printf("No, diff = %d", finalSum);
        }

        //       горе задачата е решена с два for - цикъла
        // А тук е начина с един for - цикъл
        //        for (int i = 1; i <= 2 * n; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            if (i <= n) {
//                leftSum = leftSum + currentNum;
//            } else {
//                rightSum = rightSum + currentNum;
//            }
//        }




    }
}
