import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tshurt = Double.parseDouble(scanner.nextLine());
        double sumToWinBall = Double.parseDouble(scanner.nextLine());


        double shorts = tshurt * 0.75;
        double socks = shorts * 0.20;
        double shou = (tshurt + shorts) * 2;

        double sum = tshurt + shorts + socks + shou;

        double sumDiscount = sum - sum * 15 / 100.0;

        if (sumDiscount >= sumToWinBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sumDiscount);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", Math.abs(sumDiscount - sumToWinBall));
        }







    }
}
