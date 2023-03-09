package W07ExerciseAssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, ArrayList<String>> idMap = new LinkedHashMap<>();

        String command = scanner.nextLine();


        while (!command.equals("End")) {
            String company = command.split(" -> ")[0];
            String id = command.split(" -> ")[1];

            if (!idMap.containsKey(company)) {
                idMap.put(company, new ArrayList<>());
                idMap.get(company).add(id);
            } else {
                boolean isContains = false;
                for (String s : idMap.get(company)) {
                    if (s.equals(id)) {
                        isContains = true;
                    }
                }
                if (!isContains) {
                    idMap.get(company).add(id);
                }
            }


            command = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : idMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String s : entry.getValue()) {
                System.out.printf("-- %s%n", s);
            }


        }


    }
}
