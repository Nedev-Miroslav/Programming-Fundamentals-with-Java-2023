package W05ExerciseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt).collect(Collectors.toList());
//        List<Integer> bombNumAndPower = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt).collect(Collectors.toList());
//
//        int size = numberList.size();
//        int bombNum = bombNumAndPower.get(0);
//        int powerNum = bombNumAndPower.get(1);
//        for (int index = 0; index <= numberList.size() - 1; index++) {
//
//            if (numberList.get(index) == bombNum) {
//
//
//                if (index + 1 + powerNum <= size - 1) {
//                    for (int i = index + 1; i <= index + powerNum; i++) {
//                        numberList.set(i, 0);
//                        ;
//                    }
//
//                } else if (index + 1 + powerNum >= numberList.size() - 1) {
//                    for (int i = index + 1; i <= numberList.size() - 1; i++) {
//                        numberList.set(i, 0);
//                    }
//                }
//
//                if (index - 1 - powerNum >= 0) {
//                    for (int i = index; i >= index - powerNum; i--) {
//                        numberList.set(i, 0);
//                    }
//
//
//                } else if (index - 1 - powerNum < 0) {
//                    for (int i = index; i >= 0; i--) {
//                        numberList.set(i, 0);
//                    }
//
//                }
//
//
//            }
//
//
//        }
//        int sum = 0;
//        for (int i = 0; i < numberList.size(); i++) {
//            sum += numberList.get(i);
//        }
//        System.out.println(sum);
//
//    }
//}
        List<String> elements = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);
        int sum = 0;

        while (elements.contains(bombNumber)){
            int elementIndex = elements.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min( elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);

            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}