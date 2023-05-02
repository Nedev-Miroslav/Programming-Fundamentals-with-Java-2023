import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double result = 0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            result = side * side;
        } else if (figure.equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
           result = side1 * side2;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            result = radius * radius * Math.PI;
        } else if (figure.equals("triangle")) {
            double high = Double.parseDouble(scanner.nextLine());
            double side3 = Double.parseDouble(scanner.nextLine());
            result = (high * side3) / 2;
        }
        System.out.printf("%.3f", result);

    }
}
