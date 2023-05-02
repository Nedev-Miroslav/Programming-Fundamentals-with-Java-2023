import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numTree = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= numOne ; i++) {
            for (int j = 2; j <= numTwo; j++) {
                for (int k = 2; k <= numTree ; k++) {
                    if (i % 2 == 0 && !(numTwo % j == 0) && k % 2 == 0) {
                        System.out.printf("%d%d%d%n", i, j, k);
                    }
                }
            }
        }


    }
}
