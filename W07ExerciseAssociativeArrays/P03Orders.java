package W07ExerciseAssociativeArrays;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, ArrayList<Double>> productMap = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String product = command.split("\\s+")[0];
            double price = Double.parseDouble(command.split("\\s+")[1]);
            double quantity = Double.parseDouble(command.split("\\s+")[2]);
            if (!productMap.containsKey(product)) {
                productMap.put(product, new ArrayList<>());
                productMap.get(product).add(price);
                productMap.get(product).add(quantity);
            } else {
                List<Double> currentList = productMap.get(product);
                double current = currentList.get(1);
                productMap.get(product).set(0, price);
                productMap.get(product).set(1, current + quantity);

            }

            command = scanner.nextLine();
        }
        LinkedHashMap<String, Double> finalMap = new LinkedHashMap<>();


        for (Map.Entry<String, ArrayList<Double>> entry : productMap.entrySet()) {
            double first = entry.getValue().get(0);
            double second = entry.getValue().get(1);

            finalMap.put(entry.getKey(), first * second);
        }

        for (Map.Entry<String, Double> entry : finalMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }


    }
}
