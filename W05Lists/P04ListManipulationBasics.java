package W05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] commandContains = command.split(" ");
            String indexcomand = commandContains[0];
            if (indexcomand.equals("Add")) {
                int indexAdd = Integer.parseInt(commandContains[1]);
                numberList.add(indexAdd);

            } else if (indexcomand.equals("Remove")) {
                int valueRemove = Integer.parseInt(commandContains[1]);
                numberList.remove(Integer.valueOf(valueRemove));

            } else if (indexcomand.equals("RemoveAt")) {
                int indexRemove = Integer.parseInt(commandContains[1]);
                numberList.remove(indexRemove);

            } else if (indexcomand.equals("Insert")) {
                int indexAdd1 = Integer.parseInt(commandContains[1]);
                int numAdd = Integer.parseInt(commandContains[2]);
                numberList.add(numAdd, indexAdd1);
            }


            command = scanner.nextLine();
        }

        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));


    }
}
