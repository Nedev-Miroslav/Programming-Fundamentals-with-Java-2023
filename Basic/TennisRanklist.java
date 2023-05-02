import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTourneys = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int gamePoint = 0;


        double win = 0.0;
        double percentW = 0.0;
        int avarage = 0;


        for (int i = 1; i <= countTourneys; i++) {
            String achievement = scanner.nextLine();

            if (achievement.equals("W")) {
                win = win + 1;
            }
            switch (achievement) {
                case "W":
                    points = points + 2000;
                    gamePoint = gamePoint + 2000;
                    break;
                case "F":
                    points = points + 1200;
                    gamePoint = gamePoint + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    gamePoint = gamePoint + 720;
                    break;


            }


        }
        percentW = win / countTourneys * 100;
        avarage = gamePoint / countTourneys;
        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %d%n", avarage);
        System.out.printf("%.2f%%", percentW);

    }
}
