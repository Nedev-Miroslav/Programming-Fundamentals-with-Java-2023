package W09ExerciseRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        List<String> attackedPlanetsList = new LinkedList<>();
        List<String> destroyedPlanetsList = new LinkedList<>();


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();


            String encrypted = "";
            int count = 0;
            for (char symbols : input.toCharArray()) {

                if (symbols == 'S' || symbols == 's' || symbols == 'T' || symbols == 't' ||
                        symbols == 'A' || symbols == 'a' || symbols == 'R' || symbols == 'r') {
                    count++;
                }


            }
            for (char symbols : input.toCharArray()) {

                encrypted += (char) (symbols - count);

            }
            Pattern pattern = Pattern.compile("^[^\\@\\-\\!\\:\\>]*@(?<planetName>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*:(?<populaltion>[0-9]+)[^\\@\\-\\!\\:\\>]*!(?<status>[AD])![^\\@\\-\\!\\:\\>]*->(?<soldier>[0-9]+)[^\\@\\-\\!\\:\\>]*$");
            Matcher matcher = pattern.matcher(encrypted);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String status = matcher.group("status");

                if (status.equals("A")) {

                    attackedPlanetsList.add(planetName);


                } else if (status.equals("D")) {

                    destroyedPlanetsList.add(planetName);

                }


            }


        }


        System.out.printf("Attacked planets: %d%n", attackedPlanetsList.size());
        attackedPlanetsList.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));

        System.out.printf("Destroyed planets: %d%n", destroyedPlanetsList.size());
        destroyedPlanetsList.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));

    }
}
