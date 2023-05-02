import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double price = 7.61;
        double discount = 0.18;
        double totalPrice = area * price;
        double finalPrice = totalPrice - totalPrice * discount;
        double finalDiscout = totalPrice * discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + finalDiscout + " lv.");

    }
}
