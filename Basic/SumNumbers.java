import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumNum = 0;

        while (!(sumNum >= num)) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumNum = sumNum + currentNum;

        }
        System.out.println(sumNum);


    }
}
