package W05ExerciseList;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Това е моето решение на което обаче получавам 75/100 в judge
//        List<String> numberList = Arrays.stream(scanner.nextLine().split("\\|"))
//                .collect(Collectors.toList());
//
//        List<String> finalList = new ArrayList<>();
//        for (int i = numberList.size() - 1; i >= 0; i--) {
//            List<String> numberList2 = Arrays.stream(numberList.get(i).split(" "))
//                    .collect(Collectors.toList());
//
//            for (int j = 0; j < numberList2.size(); j++) {
//                if (numberList2.get(j).equals("")) {
//                    numberList2.remove(j);
//                }
//                finalList.add(numberList2.get(j));
//            }
//
//        }
//
//
//        System.out.println(String.join(" ", finalList));
//
//    }
 List<String> arrays = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arrays);
        String toPrint = arrays.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);
    }
}