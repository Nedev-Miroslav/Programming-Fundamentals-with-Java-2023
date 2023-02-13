package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (numberList.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());


            if (index >= 0 && index <= numberList.size() - 1) {
                int removedElement = numberList.get(index);
                sum = sum + removedElement;
                numberList.remove(index);
                extracted(numberList, removedElement);


            } else if (index < 0) {
                int removedElement = numberList.get(0);
                sum = sum + removedElement;
                numberList.remove(0);
                int lastElement = numberList.get(numberList.size() - 1);
                numberList.add(0, lastElement);
                extracted(numberList, removedElement);


            } else if (index > numberList.size() - 1) {

                int removedElement = numberList.get(numberList.size() - 1);
                sum = sum + removedElement;
                numberList.remove(numberList.size() - 1);
                int firstElement = numberList.get(0);
                numberList.add(firstElement);
                extracted(numberList, removedElement);


            }


        }

        System.out.println(sum);
    }

    private static void extracted(List<Integer> numberList, int removedElement) {
        for (int i = 0; i <= numberList.size() - 1; i++) {
            int currentElement = numberList.get(i);
            if (removedElement >= currentElement) {
                numberList.set(i, currentElement + removedElement);
            } else {
                numberList.set(i, currentElement - removedElement);
            }

        }
    }
}
