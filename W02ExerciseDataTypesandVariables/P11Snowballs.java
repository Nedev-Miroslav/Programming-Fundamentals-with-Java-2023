package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highestValue = Double.MIN_VALUE;
        int ballShow = 0;
        int ballTime = 0;
        int ballQuality = 0;


        for (int i = 1; i <= n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime  = Integer.parseInt(scanner.nextLine());
            int snowballQuality  = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > highestValue) {
                 highestValue = snowballValue;

                ballShow = snowballSnow;
                ballTime = snowballTime;
                ballQuality = snowballQuality;

            }



        }
            double ballValue = Math.pow((ballShow / ballTime), ballQuality);

        System.out.printf("%d : %d = %.0f (%d)", ballShow, ballTime, ballValue, ballQuality);





    }
}
