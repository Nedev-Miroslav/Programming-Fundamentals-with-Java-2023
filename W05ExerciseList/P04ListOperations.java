package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] separateCommand = command.split("\\s+");

            if (command.contains("Add")) {
                int addNum = Integer.parseInt(separateCommand[1]);
                numberList.add(addNum);

            } else if (command.contains("Insert")) {
                int insertNum = Integer.parseInt(separateCommand[1]);
                int indexInsert = Integer.parseInt(separateCommand[2]);
                if (indexInsert >= 0 && indexInsert <= numberList.size() - 1) {
                    numberList.add(indexInsert, insertNum);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int removeIndex = Integer.parseInt(separateCommand[1]);
                if (removeIndex >= 0 && removeIndex <= numberList.size() - 1) {
                    numberList.remove(removeIndex);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("left")) {
                int shiftLeftCount = Integer.parseInt(separateCommand[2]);
                for (int i = 0; i < shiftLeftCount; i++) {
                    int firstNum = numberList.get(0);
                    numberList.remove(0);
                    numberList.add(firstNum);
                }

            } else if (command.contains("right")) {
                int shiftRightCount = Integer.parseInt(separateCommand[2]);
                for (int i = 0; i < shiftRightCount; i++) {
                    int lastNum = numberList.get(numberList.size() - 1);
                    numberList.remove(numberList.size() - 1);
                    numberList.add(0, lastNum);
                }


            }


            command = scanner.nextLine();
        }

        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));

    }
}
