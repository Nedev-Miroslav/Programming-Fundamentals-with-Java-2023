package W08TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> banWords = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String text = scanner.nextLine();


        for (int i = 0; i < banWords.size(); i++) {
            String ban = banWords.get(i);
            text = text.replace(ban, asterisksCount(ban));


        }

        System.out.println(text);


    }

    public static String asterisksCount(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append("*");
        }

        return sb.toString();

    }


}
