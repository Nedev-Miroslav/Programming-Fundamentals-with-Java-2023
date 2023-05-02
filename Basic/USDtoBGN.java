import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double fix = 1.79549;
        double bgn = usd * fix;
        System.out.println(bgn);
    }
}
