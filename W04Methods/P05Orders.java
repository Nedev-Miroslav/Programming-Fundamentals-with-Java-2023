package W04Methods;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());
        printProduct(productInput, quantityInput);


    }


    public static void printProduct(String product, int quantity) {
        double result = 0.0;
        if (product.equals("coffee")) {
            result = quantity * 1.5;
        } else if (product.equals("water")) {
            result = quantity * 1.0;
        } else if (product.equals("coke")) {
            result = quantity * 1.4;
        } else if (product.equals("snacks")) {
            result = quantity * 2.0;
        }
        System.out.printf("%.2f", result);

    }
}
