import java.util.Scanner;

public class test2second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double result = distance * timeInSec;
        double slowDown = Math.floor(distance / 50) * 30;

        double finalResult = result + slowDown;

        if (finalResult < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", finalResult);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(record - finalResult));

        }
    }
}
