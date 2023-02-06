package W04ExeciseMethods;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean checkNum = printTop(i);
            if (checkNum) {
                System.out.println(i);
            }
        }


    }

    public static boolean printTop(int num) {
        int sum = 0;
        int odd = 0;
        boolean isTop = false;
        while (num > 0) {

            int currentDigit = num % 10;
            sum += currentDigit;
            if (currentDigit % 2 != 0) {
                odd++;
            }
            num = num / 10;
            }
        if (sum % 8 == 0 && odd >= 1) {
            isTop = true;

        }
        return isTop;
    }


}
