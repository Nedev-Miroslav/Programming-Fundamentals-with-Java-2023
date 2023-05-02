import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double finalPoints = 0.0;


        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            double length = juryName.length();

            finalPoints = length * juryPoints / 2;
            academyPoints = academyPoints + finalPoints;

            if (academyPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, academyPoints);

                break;
            }


        }
        if (academyPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - academyPoints);
        }


    }
}
