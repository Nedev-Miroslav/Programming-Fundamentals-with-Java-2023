package W04ExeciseMethods;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrixNxN(n);


    }

    public static void printMatrixNxN(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }


}
