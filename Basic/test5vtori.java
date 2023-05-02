import java.util.Scanner;

public class test5vtori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cargoSection = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double sumCargo = 0.0;
        int coutCargo = 0;
        int coutCargo2 = 0;
        double totalCargo = 0.0;
        double extraCargo = 0.0;


        while (!input.equals("End")) {


            double cargo = Double.parseDouble(input);
            coutCargo++;

            if (coutCargo % 3 == 0) {
                extraCargo = cargo * 0.1;
                sumCargo = sumCargo + extraCargo;
                totalCargo = totalCargo + cargo + extraCargo;
            } else {
                totalCargo = totalCargo + cargo;
            }

            if (totalCargo < cargoSection) {
                coutCargo2++;
            }

            if (totalCargo > cargoSection) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", coutCargo2);
                break;
            }

            input = scanner.nextLine();

        }
        if ("End".equals(input)) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", coutCargo);
        }

    }
}
