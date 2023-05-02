import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int sum = 0;
        String oddOrEven = "";

        switch (operator) {
            case "+":
                sum = N1 + N2;
                if (sum % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, sum, oddOrEven);
                break;
            case "-":
                sum = N1 - N2;
                if (sum % 2 == 0) {
                    oddOrEven = "even"; // четно
                } else {
                    oddOrEven = "odd"; // нечетно
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, sum, oddOrEven);
                break;
            case "*":
                sum = N1 * N2;
                if (sum % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, sum, oddOrEven);
                break;
            case "/":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double divideResult = (1.0 * N1) / N2;
                    System.out.printf("%d %s %d = %.2f", N1, operator, N2, divideResult);
                }
                break;
            case "%":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    sum = N1 % N2;
                    System.out.printf("%d %s %d = %d", N1, operator, N2, sum);
                }
                break;

        }
    }
}