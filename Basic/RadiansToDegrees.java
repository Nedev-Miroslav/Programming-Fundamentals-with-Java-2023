import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angle = Double.parseDouble(scanner.nextLine());
        double degree = angle * 180 / Math.PI;
        System.out.println(degree);


    }
}
