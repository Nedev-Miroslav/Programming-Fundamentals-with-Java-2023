package W04Methods;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputTimes = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, inputTimes));


    }

    public static String repeatString(String text, int timenes) {
        String result = "";
        for (int i = 1; i <= timenes; i++) {
            result = result + text;
        }

        return result;
    }


}
