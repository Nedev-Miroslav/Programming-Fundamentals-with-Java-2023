import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacantionPrice = Double.parseDouble(scanner.nextLine());
        double startMoney = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int allDayCount = 0;


        while (vacantionPrice > startMoney && spendCount < 5) {
            String saveOrSpend = scanner.nextLine();
            double transaction = Double.parseDouble(scanner.nextLine());
            allDayCount++;
            if (saveOrSpend.equals("spend")) {
                spendCount++;
                startMoney = startMoney - transaction;
                if (startMoney < 0) {
                    startMoney = 0;
                }
                } else if (saveOrSpend.equals("save")) {
                startMoney = startMoney + transaction;
                spendCount = 0;

            }

        }
        if (spendCount == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDayCount);
        }
        if (startMoney >= vacantionPrice) {
            System.out.printf("You saved the money for %d days.", allDayCount);
        }


    }
}
