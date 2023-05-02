import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double sumFood = Double.parseDouble(scanner.nextLine());
        double dogSumEat = 0.0;
        double catSumEat = 0.0;
        double cocke = 0.0;
        int singleDay = 0;
        double totalEaten = 0.0;
        double cockeTotal = 0.0;





        for (int i = 1; i <= days; i++) {
            int dogFoodEaten = Integer.parseInt(scanner.nextLine());
            int catFoodEaten = Integer.parseInt(scanner.nextLine());
            singleDay = dogFoodEaten + catFoodEaten;
            if (i % 3 == 0) {

                cocke = singleDay * 0.1;
                cockeTotal = cockeTotal + cocke;

            }
            dogSumEat = dogSumEat + dogFoodEaten;
            catSumEat = catSumEat + catFoodEaten;
            totalEaten = totalEaten + dogFoodEaten + catFoodEaten;


        }

        double percentSumEaten = totalEaten / sumFood * 100;
        double dogPercent = dogSumEat / totalEaten * 100;
        double catPercent = catSumEat / totalEaten * 100;


        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(cockeTotal));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentSumEaten);
        System.out.printf("%.2f%% eaten from the dog.%n", dogPercent);
        System.out.printf("%.2f%% eaten from the cat.%n", catPercent);





    }
}
