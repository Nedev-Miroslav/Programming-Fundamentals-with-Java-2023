import java.util.Scanner;

public class TimeAftrer15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMin = hour * 60 + min + 15;

        hour = totalMin / 60;
        min = totalMin % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, min);

    }
}