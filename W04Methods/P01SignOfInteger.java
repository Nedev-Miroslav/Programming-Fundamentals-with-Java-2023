package W04Methods;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printSign(n);

    }

    public static void printSign(int num) {
        String sign = "";
        if (num < 0) {
            sign = "negative";
        } else if (num > 0) {
            sign = "positive";
        } else {
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", num, sign);

    }
}
