package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numberList2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (numberList1.size() != 0 && numberList2.size() != 0) {
            int firstPlayer = numberList1.get(0);
            int secondPlayer = numberList2.get(0);
            numberList1.remove(0);
            numberList2.remove(0);

            if (firstPlayer > secondPlayer) {
                numberList1.add(firstPlayer);
                numberList1.add(secondPlayer);

            } else if (firstPlayer < secondPlayer) {
                numberList2.add(secondPlayer);
                numberList2.add(firstPlayer);

            }

        }

        if (numberList1.size() == 0) {
            int sum = getSum(numberList2);
            System.out.printf("Second player wins! Sum: %d", sum);

        } else if (numberList2.size() == 0) {
            int sum = getSum(numberList1);

            System.out.printf("First player wins! Sum: %d", sum);

        }

    }

    private static int getSum(List<Integer> num) {
        int sum = 0;

        for (int card : num) {
            sum += card;
        }
        return sum;
    }
}
