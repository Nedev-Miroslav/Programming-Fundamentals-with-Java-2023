import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int read = totalPages / pages;
        int totalDays = read / days;

        System.out.println(totalDays);
    }
}
