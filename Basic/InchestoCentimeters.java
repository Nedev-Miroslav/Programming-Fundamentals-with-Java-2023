import java.util.Scanner;

public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        double centimeters = Double.parseDouble(scaner.nextLine());
        double result = centimeters * 2.54;
        System.out.println(result);


    }
}
