package A00forTraining;

import java.util.Scanner;

public class Problem1GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double petWeight = Double.parseDouble(scanner.nextLine());


        double foodInGr = food * 1000;
        double hayInGr = hay * 1000;
        double coverInGr = cover * 1000;
        double petWeightInGr = petWeight * 1000;


        for (int i = 1; i <= 30; i++) {
            foodInGr -= 300;
            if(i % 2 == 0) {
                double hayQuantity = foodInGr * 0.05;
                hayInGr -= hayQuantity;
            }
            if (i % 3 == 0) {
                double coverQuantity = petWeightInGr / 3;
                coverInGr -= coverQuantity;
            }

        }

            if (foodInGr > 0 && hayInGr > 0 && coverInGr > 0) {
                System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.%n"
                        , foodInGr / 1000, hayInGr / 1000, coverInGr / 1000);
            } else {
                System.out.println("Merry must go to the pet store!");
            }



    }
}
