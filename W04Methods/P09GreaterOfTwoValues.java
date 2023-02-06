package W04Methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int n1 = Integer.parseInt(scanner.nextLine());
                int n2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(n1, n2));
                break;
            case "char":
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1, symbol2));
                break;
            case "string":
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                System.out.println(getMax(s1, s2));
                break;


        }
    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    public static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) > 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}