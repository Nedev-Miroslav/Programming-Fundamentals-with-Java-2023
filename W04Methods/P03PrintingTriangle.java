package W04Methods;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);

//         така изглежда задачата без методи
//         int num = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        for (int j = num - 1; j >= 1; j--) {
//            for (int k = 1; k <= j; k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }



    }
    public static void printTriangle (int number) {

        for (int i = 1; i <= number ; i++) {
            printLine(1, i);
            }
        for (int i = number -1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }

        public static void printLine (int start, int end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

}
