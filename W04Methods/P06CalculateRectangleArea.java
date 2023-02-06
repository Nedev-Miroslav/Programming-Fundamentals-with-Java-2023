package W04Methods;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(rectangleResult(scanner));

    }

    public static int rectangleResult(Scanner scanner) {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        return a * b;


    }
}

