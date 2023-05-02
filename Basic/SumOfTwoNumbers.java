import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int countCombination = 0;
        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                countCombination++;
                int sum = i + j;
                if (sum == magicNum) {
                    System.out.printf("Combination N:%d ", countCombination);
                    System.out.printf("(%d + %d = %d)%n", i, j, magicNum);
                    flag = true;
                    break;
                }


            }
            if (flag) {
                break;
            }

        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", countCombination, magicNum);
        }

    }
}
