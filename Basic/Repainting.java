import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());

        double needNylon = (nylon + 2) * 1.5;
        double needPaint = (paint + 0.1 * paint) * 14.5;
        double needThinner = thinner * 5;
        double bag = 0.40;

        double price = needNylon + needPaint + needThinner + bag;
        double worker = (price * 0.3) * hour;
        double totalPrice = price + worker;
        System.out.println(totalPrice);

    }
}
