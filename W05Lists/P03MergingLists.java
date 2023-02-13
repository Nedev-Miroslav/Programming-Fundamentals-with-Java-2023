package W05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List <Integer> numList1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> numList2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int size = Math.min(numList1.size(), numList2.size());

        List <Integer> allNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            allNumbers.add(numList1.get(i));
            allNumbers.add(numList2.get(i));

        }
//            if (numList1.size() > numList2.size()){
//                allNumbers.addAll(numList1.subList(size, numList1.size()));
//
//            } else {
//                allNumbers.addAll(numList2.subList(size, numList2.size()));
//            }

            if (numList1.size() > numList2.size()){
                for (int i = size; i < numList1.size(); i++) {
                    allNumbers.add(numList1.get(i));
                }
            } else {
                for (int i = size; i < numList2.size(); i++) {
                    allNumbers.add(numList2.get(i));
                }
            }


        System.out.println(allNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
