package W09RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359(?<separator>[ -])2(?:\\1)[0-9]{3}(?:\\1)[0-9]{4}\\b");

        Matcher matcher = pattern.matcher(input);

        List<String> resultList = new ArrayList<>();
        while (matcher.find()) {
            String currentMatch = matcher.group();
            resultList.add(currentMatch);

        }

        System.out.println(String.join(", ", resultList));


    }
}
