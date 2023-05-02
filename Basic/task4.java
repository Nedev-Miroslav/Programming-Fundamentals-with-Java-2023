import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countComputers = Integer.parseInt(scanner.nextLine());
        double allSells = 0;
        double count = 0;

        for (int i = 1; i <= countComputers; i++) {
            int modelNum = Integer.parseInt(scanner.nextLine());
            double raiting = 0;
            int firstTwoNum = 0;
            double daySells = 0;
            if (modelNum % 10 == 2) {
                raiting = 0;
                count = count + 2;
            } else if (modelNum % 10 == 3) {
                raiting = 0.50;
                count = count + 3;
            } else if (modelNum % 10 == 4) {
                raiting = 0.70;
                count = count + 4;
            } else if (modelNum % 10 == 5) {
                raiting = 0.85;
                count = count + 5;
            } else if (modelNum % 10 == 6) {
                raiting = 1.0;
                count = count + 6;
            }

            firstTwoNum = modelNum / 10;
            daySells = firstTwoNum * raiting;

            allSells = allSells + daySells;


        }

        System.out.printf("%.2f%n", allSells);
        System.out.printf("%.2f%n", count / countComputers);


    }
}
