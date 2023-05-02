import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean invalidNum = num >= 100 && num <= 200 || num == 0;
       if (!invalidNum) {
           System.out.println("invalid");
       }
    }
}

