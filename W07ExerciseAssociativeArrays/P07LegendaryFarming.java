package W07ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> importantItemMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();

        String inputItems = scanner.nextLine().toLowerCase();

        boolean isGain = false;
        while (!isGain) {


            String[] inputArr = inputItems.split("\\s+");

            for (int i = 0; i < inputArr.length; i += 2) {
                int quantity = Integer.parseInt(inputArr[i]);
                String material = inputArr[i + 1];

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    importantItemMap.putIfAbsent(material, 0);
                    importantItemMap.put(material, importantItemMap.get(material) + quantity);

                    if (importantItemMap.containsKey("shards") && importantItemMap.get("shards") >= 250) {
                        importantItemMap.put("shards", importantItemMap.get("shards") - 250);
                        System.out.println("Shadowmourne obtained!");
                        isGain = true;
                        break;
                    }
                    if (importantItemMap.containsKey("fragments") && importantItemMap.get("fragments") >= 250) {
                        importantItemMap.put("fragments", importantItemMap.get("fragments") - 250);
                        System.out.println("Valanyr obtained!");
                        isGain = true;
                        break;
                    }
                    if (importantItemMap.containsKey("motes") && importantItemMap.get("motes") >= 250) {
                        importantItemMap.put("motes", importantItemMap.get("motes") - 250);
                        System.out.println("Dragonwrath obtained!");
                        isGain = true;
                        break;
                    }


                } else {
                    junkMap.putIfAbsent(material, 0);
                    junkMap.put(material, junkMap.get(material) + quantity);

                }

            }

            if (isGain) {
                break;
            }

            inputItems = scanner.nextLine().toLowerCase();
        }
        if (!importantItemMap.containsKey("shards")) {
            importantItemMap.put("shards", 0);
        }
        if (!importantItemMap.containsKey("fragments")) {
            importantItemMap.put("fragments", 0);
        }
        if (!importantItemMap.containsKey("motes")) {
            importantItemMap.put("motes", 0);
        }

        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n", importantItemMap.get("shards"), importantItemMap.get("fragments"), importantItemMap.get("motes"));


        for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


    }
}
