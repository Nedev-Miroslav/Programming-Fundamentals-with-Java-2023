package W09ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]+)!(?<quantity>[0-9]+)");

        List<String> boughtFurnitureList = new ArrayList<>();
        double sum = 0.0;


        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);


            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double currentAmount = price * quantity;

                sum += currentAmount;

                boughtFurnitureList.add(furniture);


            }


            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String name : boughtFurnitureList) {
            System.out.println(name);
        }

        System.out.printf("Total money spend: %.2f", sum);


    }
}
