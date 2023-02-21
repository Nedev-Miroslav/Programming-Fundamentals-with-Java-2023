package A00forTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] separateCommand = command.split("\\s+");

            if (command.contains("Urgent")) {
                String urgentProduct = separateCommand[1];
                if (!productList.contains(urgentProduct)) {
                    productList.add(0, urgentProduct);
                }


            } else if (command.contains("Unnecessary")) {
                String unnecessaryProduct = separateCommand[1];
                if (productList.contains(unnecessaryProduct)) {
                    productList.remove(unnecessaryProduct);
                }


            } else if (command.contains("Correct")) {
                String oldProduct = separateCommand[1];
                String newProduct = separateCommand[2];
                if (productList.contains(oldProduct)) {
                    int index = productList.indexOf(oldProduct);
                    productList.set(index, newProduct);


                }


            } else if (command.contains("Rearrange")) {
                String rearrangeProduct = separateCommand[1];
                if (productList.contains(rearrangeProduct)) {
                    productList.remove(rearrangeProduct);
                    productList.add(rearrangeProduct);


                }


            }


            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", productList));


    }
}
