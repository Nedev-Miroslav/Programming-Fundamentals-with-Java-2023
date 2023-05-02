import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());

        int musalla = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        int coutClimber = 0;

        double percentMusalla = 0.0;
        double percentMonblan = 0.0;
        double percentKilimanjaro = 0.0;
        double percentK2 = 0.0;
        double percentEverest = 0.0;


        for (int i = 1; i <= group; i++) {
            int climber = Integer.parseInt(scanner.nextLine());
            coutClimber = coutClimber + climber;


            if (climber >= 1 && climber <= 5) {
                musalla = musalla + climber;
            } else if (climber >= 6 && climber <= 12) {
                monblan = monblan + climber;
            } else if (climber >= 13 && climber <= 25) {
                kilimanjaro = kilimanjaro + climber;
            } else if (climber >= 26 && climber <= 40) {
                k2 = k2 + climber;
            } else if (climber >= 41) {
                everest = everest + climber;
            }


        }
        percentMusalla = (musalla * 1.0) / coutClimber * 100;
        percentMonblan = (monblan * 1.0) / coutClimber * 100;
        percentKilimanjaro = (kilimanjaro * 1.0) / coutClimber * 100;
        percentK2 = (k2 * 1.0) / coutClimber * 100;
        percentEverest = (everest * 1.0) / coutClimber * 100;

        System.out.printf("%.2f%%%n", percentMusalla);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);


    }
}
