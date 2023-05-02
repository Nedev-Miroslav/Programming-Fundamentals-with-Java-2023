
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1; // колко числа сме отпечатали и кое е текущото число

        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(current + " ");
                current++;

                if (current > n) {
                    break;
                }
            }

            if (current > n) {
                break;
            }
            System.out.println();
        }

    }
}