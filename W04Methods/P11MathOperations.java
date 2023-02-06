package W04Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());
        double result = (calculate(n1, operator, n2));
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    public static double calculate(int num1, String operator, int num2) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = 1.0 * num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }

        return result;
    }

}
