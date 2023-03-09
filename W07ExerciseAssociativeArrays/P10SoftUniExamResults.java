package W07ExerciseAssociativeArrays;

import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("exam finished")) {


            if (command.contains("banned")) {
                String bannedName = command.split("-")[0];
                map.remove(bannedName);


            } else {
                String name = command.split("-")[0];
                String language = command.split("-")[1];
                int points = Integer.parseInt(command.split("-")[2]);
                if (!countMap.containsKey(language)) {
                    countMap.put(language, 1);
                } else {
                    int value = countMap.get(language);
                    countMap.put(language, value + 1);
                }

                if (!map.containsKey(name)) {
                    map.put(name, points);


                } else {

                    if (map.get(name) < points) {
                        map.put(name, points);
                    }

                }

            }


            command = scanner.nextLine();
        }

        System.out.println("Results: ");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println("Submissions: ");

        for (Map.Entry<String, Integer> entry2 : countMap.entrySet()) {
            System.out.printf("%s - %d%n", entry2.getKey(), entry2.getValue());
        }


    }

}
