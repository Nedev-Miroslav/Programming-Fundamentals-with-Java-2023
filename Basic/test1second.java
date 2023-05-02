import java.util.Scanner;

public class test1second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcon = Integer.parseInt(scanner.nextLine());
        double chinaYan = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double bitconInLeva = bitcon * 1168.0;
        double yanInUsd = chinaYan * 0.15;
        double usdInLeva = yanInUsd * 1.76;

        double sumInEuro = (bitconInLeva + usdInLeva) / 1.95;
        double totalSum = sumInEuro - sumInEuro * tax / 100;
        System.out.printf("%.2f", totalSum);

    }
}
