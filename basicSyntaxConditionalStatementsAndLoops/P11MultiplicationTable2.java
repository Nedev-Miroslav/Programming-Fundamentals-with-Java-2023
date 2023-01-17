package basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;

        for (int i = num2; i <= 10; i++) {

            System.out.printf("%d X %d = %d%n", num, i, num * i);
            isValid = true;


        }
        if (!isValid) {
            System.out.printf("%d X %d = %d%n", num, num2, num * num2);
        }
//        int number = Integer.parseInt(scanner.nextLine());
//        int times = Integer.parseInt(scanner.nextLine());
//        do {
//            System.out.printf("%d X %d = %d%n",
//                    number, times, number * times);
//            times++;
//        } while (times <= 10);


    }


}
