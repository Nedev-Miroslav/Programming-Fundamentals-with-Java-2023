package A00MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Second03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int size = 0;

        for (int i = 0; i < numberList.size(); i++) {
            size += numberList.get(i);
        }

        double averageNum = 1.0 * size / numberList.size();
        List<Integer> highNum = new ArrayList<>();
        int lovNum = 0;

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > averageNum) {
                highNum.add(numberList.get(i));
            } else {
                lovNum++;
            }
        }
        if (lovNum == numberList.size()) {
            System.out.println("No");
            return;
        }
        Collections.sort(highNum);
        Collections.reverse(highNum);
        List<Integer> topHighNum = new ArrayList<>();
        int topSize = Math.min(5, highNum.size());

            for (int i = 0; i < topSize; i++) {
                topHighNum.add(highNum.get(i));
            }



        System.out.println(topHighNum.toString().replaceAll("[\\[\\],]", ""));

    }
}
