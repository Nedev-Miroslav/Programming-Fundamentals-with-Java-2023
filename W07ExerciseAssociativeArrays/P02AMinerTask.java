package W07ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> resourceMap = new LinkedHashMap<>();
        int count = 0;
        String typeResource = "";
        int amount = 0;

        while (!command.equals("stop")) {
            count++;
            if (count % 2 != 0) {
                typeResource = command;
                resourceMap.putIfAbsent(typeResource, 0);
            } else {
                amount = Integer.parseInt(command);
                resourceMap.put(typeResource, resourceMap.get(typeResource) + amount);

            }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
