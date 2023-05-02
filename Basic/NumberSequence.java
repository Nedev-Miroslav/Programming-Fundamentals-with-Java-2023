import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;


        for (int i = 1; i <= num; i++) {
            int curentNum = Integer.parseInt(scanner.nextLine());

            if (curentNum > maxNum) {
                maxNum = curentNum;
            }
            if (curentNum < minNum) {
                minNum = curentNum;
            }

        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);


    }
}
