import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projects = scanner.nextLine();
        int c = Integer.parseInt(scanner.nextLine());
        int r = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        switch (projects) {
            case "Premiere":
                sum = c * r * 12.0;
                break;
            case "Normal":
                sum = c * r * 7.5;
                break;
            case "Discount":
                sum = c * r * 5.0;
                break;
        }
        System.out.printf("%.2f leva", sum);

    }
}
