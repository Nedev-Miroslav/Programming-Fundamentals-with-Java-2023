import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int sumEatenFood = 0;
        int foodInGrams = food * 1000;



        while (!input.equals("Adopted")) {
            int eatenFood = Integer.parseInt(input);
            sumEatenFood = eatenFood + sumEatenFood;


            input = scanner.nextLine();
        }
        if (foodInGrams >= sumEatenFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - sumEatenFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", sumEatenFood - foodInGrams);
        }
    }
}
