package W05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int size = numList.size();
        for (int i = 0; i < size / 2; i++) {
            int sum = numList.get(i) + numList.get(numList.size() - 1);
            numList.set(i, sum);
            numList.remove(numList.size() - 1);


        }
//        for (int i = 0; i < numList.size(); i++) {
//            System.out.print(numList.get(i) + " ");
//
//
//        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

    }
}
