import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int P1 = 0;
        int P2 = 0;
        int P3 = 0;
        int P4 = 0;
        int P5 = 0;
        double percentP1 = 0.0;
        double percentP2 = 0.0;
        double percentP3 = 0.0;
        double percentP4 = 0.0;
        double percentP5 = 0.0;


        for (int i = 1; i <= num; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());


            if (currentNum >= 1 && currentNum < 200) {
                P1 = P1 + 1;
            } else if (currentNum >= 200 && currentNum <= 399) {
                P2 = P2 + 1;
            } else if (currentNum >= 400 && currentNum <= 599) {
                P3 = P3 + 1;
            } else if (currentNum >= 600 && currentNum <= 799) {
                P4 = P4 + 1;
            } else if (currentNum >= 800) {
                P5 = P5 + 1;
            }

            percentP1 = (P1 * 1.0) / num * 100;
            percentP2 = (P2 * 1.0) / num * 100;
            percentP3 = (P3 * 1.0) / num * 100;
            percentP4 = (P4 * 1.0) / num * 100;
            percentP5 = (P5 * 1.0) / num * 100;


        }
        System.out.printf("%.2f%%%n", percentP1);
        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%%n", percentP3);
        System.out.printf("%.2f%%%n", percentP4);
        System.out.printf("%.2f%%%n", percentP5);


    }
}
