package W07AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> countMap = new TreeMap<>();


        for (double num : numbersArr) {

//            Трети начин!
            countMap.putIfAbsent(num, 0);
            countMap.put(num, countMap.get(num) + 1);



//            Втори начин!
//            if(!countMap.containsKey(num)) {
//                countMap.put(num, 0);
//            }
//            int value =countMap.get(num);
//            countMap.put(num, value + 1);



//            Първи начин!
//            if (!countMap.containsKey(num)) {
//                countMap.put(num, 1);
//            } else {
//                int currentValue = countMap.get(num);
//                countMap.put(num, currentValue + 1);
//            }


        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}