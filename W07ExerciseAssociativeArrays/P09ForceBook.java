package W07ExerciseAssociativeArrays;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("Lumpawaroo")) {

            if (command.contains("|")) {
                String startSide = command.split("\\s+\\|\\s+")[0];
                String name = command.split("\\s+\\|\\s+")[1];

                map.putIfAbsent(startSide, new ArrayList<>());
                boolean isContains = false;

                for (List<String> list : map.values()) {
                    if (list.contains(name)) {
                        isContains = true;
                        break;
                    }
                }

                if (!isContains) {
                    map.get(startSide).add(name);
                }

            } else if (command.contains("->")) {
                String member = command.split("\\s+->\\s+")[0];
                String side = command.split("\\s+->\\s+")[1];


                map.entrySet().forEach(entry -> entry.getValue().remove(member));

                if (map.containsKey(side)) {
                    List<String> currentPlayer = map.get(side);
                    currentPlayer.add(member);
                } else {
                    map.put(side, new ArrayList<>());
                    map.get(side).add(member);
                }

                System.out.printf("%s joins the %s side!%n", member, side);


            }


            command = scanner.nextLine();

        }

        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(member -> System.out.printf("! %s%n", member));

                });


    }
}
