package W09ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split("[,\\s+]+");


        for (int i = 0; i < inputArr.length; i++) {
            String currentDemon = inputArr[i];
            Pattern healthPattern = Pattern.compile("([^0-9.+\\/*-])");
            Matcher healthMatcher = healthPattern.matcher(currentDemon);


            int health = 0;
            StringBuilder sb = new StringBuilder();
            while (healthMatcher.find()) {
                String currentLetter = healthMatcher.group();
                sb.append(currentLetter);
            }

            for (char symbol : sb.toString().toCharArray()) {
                health += symbol;
            }


            Pattern damagePattern = Pattern.compile("\\-?[0-9]+\\.?[0-9]*");
            Matcher damageMatcher = damagePattern.matcher(currentDemon);


            double damage = 0;
            while (damageMatcher.find()) {
                double currentDigit = Double.parseDouble(damageMatcher.group());
                damage += currentDigit;


            }

            Pattern operationPattern = Pattern.compile("[*\\/]");
            Matcher operationMatcher = operationPattern.matcher(currentDemon);

            while (operationMatcher.find()) {
                String currentOperation = operationMatcher.group();

                if (currentOperation.equals("*")) {
                    damage *= 2;

                } else if (currentOperation.equals("/")) {
                    damage /= 2;

                }


            }


            System.out.printf("%s - %d health, %.2f damage%n", currentDemon, health, damage);


        }


    }
}
