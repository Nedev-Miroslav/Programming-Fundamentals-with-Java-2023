import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = n; i <= m; i++) { // започвам от първото число от конзолата и въртя цикъла до второто число ВКЛЮЧИТЕЛНО
            int oddSum = 0;
            int evenSum = 0;

            int current = i; // искам да манипулирам променливата current

            for (int j = 6; j >= 1; j--) { // отнася се за позиция на моята цифра
                int digit = current % 10; // 100005456 % 10 = 6 - взимам последната цифра
                if (j % 2 == 0) { // ако моята позиция на числото е четна ....
                    evenSum += digit;
                } else { // ако моята позиция на числото е нечетна...
                    oddSum += digit;
                }
                current = current / 10; // 100005456 / 10 = 10000545 - взимам числото без последната му цифра
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }

    }
}

