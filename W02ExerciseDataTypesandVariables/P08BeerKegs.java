package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double largestKeg = Double.MIN_VALUE;
        String largestKegName = "";


        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volumeOfTheKeg = Math.PI * Math.pow(radius, 2) * height;

            if (volumeOfTheKeg > largestKeg) {
                largestKeg = volumeOfTheKeg;
                largestKegName = model;
            }
        }
        System.out.printf("%s", largestKegName);

    }
}
