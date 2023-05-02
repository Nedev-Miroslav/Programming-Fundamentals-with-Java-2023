import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secunds = Integer.parseInt(scanner.nextLine());
        int secunds2 = Integer.parseInt(scanner.nextLine());
        int secunds3 = Integer.parseInt(scanner.nextLine());
        int result = secunds + secunds2 + secunds3;
        int resultMin = result / 60;
        int resultSec = result % 60;
        if (resultSec < 10) {
            System.out.println(resultMin + ":0" + resultSec);
        }
        else {
            System.out.println(resultMin + ":" + resultSec);
        }
    }
}
