import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String name = scaner.nextLine();
        System.out.println("Hello, " + name  + "!");

    }
}
