package W07ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        LinkedHashMap<Character, Integer> countCharMap = new LinkedHashMap<>();


        for (char symbol : text.toCharArray()) {

            countCharMap.putIfAbsent(symbol, 0); // Решение с функционалността putIfAbsent с един ред заменям if проверката

//            Решение с if проверка
//            if (!countCharMap.containsKey(symbol)) {
//                countCharMap.put(symbol, 0);
//            }
            countCharMap.put(symbol, countCharMap.get(symbol) + 1);


        }

        for (Map.Entry<Character, Integer> entry : countCharMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}