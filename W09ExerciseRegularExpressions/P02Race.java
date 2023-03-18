package W09ExerciseRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racerList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> containsRacerMap = new LinkedHashMap<>();

        for (String name : racerList) {
            containsRacerMap.put(name, 0);

        }

        Pattern namePattern = Pattern.compile("[A-za-z]+");
        Pattern distancePattern = Pattern.compile("[0-9]");


        String input = scanner.nextLine();

        while (!input.equals("end of race")) {


            Matcher nameMatcher = namePattern.matcher(input);
            String name = "";
            if (nameMatcher.find()) {
                name += nameMatcher.group();

            }

            int distance = 0;
            Matcher distanceMatcher = distancePattern.matcher(input);
            if (distanceMatcher.find()) {
                distance += Integer.parseInt(distanceMatcher.group());
            }

            if (containsRacerMap.containsKey(name)) {
                containsRacerMap.put(name, containsRacerMap.get(name) + distance);


            }


            input = scanner.nextLine();
        }

        int n = 1;
        for (Map.Entry<String, Integer> entry : containsRacerMap.entrySet()) {

            if (n == 1) {
                System.out.printf("%dst place: %s%n", n, entry.getKey());
                n++;
            } else if (n == 2) {
                System.out.printf("%dnd place: %s%n", n, entry.getKey());
                n++;
            } else if (n == 3) {
                System.out.printf("%drd place: %s%n", n, entry.getKey());
                n++;
            }
            if (n > 3) {
                break;
            }

        }


    }
}
