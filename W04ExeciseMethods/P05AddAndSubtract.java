package W04ExeciseMethods;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int resultOfSum = sumTwoDigits(n1, n2);
        int finalResult = divideTwoDigits(resultOfSum, n3);
        System.out.println(finalResult);


    }
    public static int sumTwoDigits (int num1, int num2) {

        return num1 + num2;
    }

    public static int divideTwoDigits (int num1, int num2) {

        return num1 - num2;
    }
}
