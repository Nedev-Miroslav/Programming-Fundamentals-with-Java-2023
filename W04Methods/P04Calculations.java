package W04Methods;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                printAdd(a, b);
                break;
            case "multiply":
                printMultiply(a, b);
                break;
            case "subtract":
                printSubtract(a, b);
                break;
            case "divide":
                printDivide(a, b);


        }


    }

    public static void printAdd(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    public static void printMultiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void printSubtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void printDivide(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }


}
