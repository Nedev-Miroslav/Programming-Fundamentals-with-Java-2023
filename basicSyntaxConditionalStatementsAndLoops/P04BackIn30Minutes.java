package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inningHour = Integer.parseInt(scanner.nextLine());
        int inningMin = Integer.parseInt(scanner.nextLine());

        int sumTimeInMin = (inningHour * 60 ) + inningMin + 30;

        int hour = sumTimeInMin / 60;
        int min = sumTimeInMin % 60;

        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d",hour,min);
    }


}
