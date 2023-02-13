package W05Lists;


import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        numberList.removeIf(e -> e < 0);
        Collections.reverse(numberList);
        if (numberList.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));
        }


    }

}
