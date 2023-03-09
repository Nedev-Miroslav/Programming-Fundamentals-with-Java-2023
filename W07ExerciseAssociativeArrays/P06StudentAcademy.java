package W07ExerciseAssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());

            }
            studentsMap.get(name).add(grade);


        }
        LinkedHashMap<String, Double> resultMap = new LinkedHashMap<>();

        for (Map.Entry<String, ArrayList<Double>> entry : studentsMap.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            resultMap.put(entry.getKey(), average);
        }

        for (Map.Entry<String, Double> entry : resultMap.entrySet()) {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }

    }
}
