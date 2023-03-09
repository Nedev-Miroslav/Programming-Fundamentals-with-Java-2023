package W07ExerciseAssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> parkingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String status = command.split("\\s+")[0];

            if (status.equals("register")) {
                String statusRegister = command.split("\\s+")[0];
                String name = command.split("\\s+")[1];
                String plateNum = command.split("\\s+")[2];

                if (!parkingMap.containsKey(name)) {
                    parkingMap.put(name, new ArrayList<>());
                    parkingMap.get(name).add(statusRegister);
                    parkingMap.get(name).add(plateNum);

                    System.out.printf("%s registered %s successfully%n", name, plateNum);

                } else {
                    for (Map.Entry<String, ArrayList<String>> entry : parkingMap.entrySet()) {
                        if (entry.getKey().equals(name)) {
                            System.out.printf("ERROR: already registered with plate number %s%n", entry.getValue().get(1));
                        }
                    }


                }


            } else if (status.equals("unregister")) {
                String statusRegister = command.split("\\s+")[0];
                String name = command.split("\\s+")[1];

                if (parkingMap.containsKey(name)) {
                    parkingMap.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);

                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }


            }


        }


        for (Map.Entry<String, ArrayList<String>> entry : parkingMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue().get(1));
        }


    }
}
