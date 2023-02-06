package W04ExeciseMethods;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        long firstFactorial = calculateFactorial(n1);
        long secondFactorial = calculateFactorial(n2);
        double result = 1.0 * firstFactorial / secondFactorial;
        System.out.printf("%.2f", result);

    }
    public static long calculateFactorial (int num) {
        long factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        return factorial;

    }



}
