package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] separateCommand = command.split(" ");
            if (command.contains("Delete")) {
                int deleteNum = Integer.parseInt(separateCommand[1]);
                numberList.removeAll(Arrays.asList(deleteNum));

//                for (int i = 0; i < numberList.size(); i++) {
//
//                    numberList.remove(Integer.valueOf(deleteNum));
//                }
            } else if (command.contains("Insert")) {
                int addElement = Integer.parseInt(separateCommand[1]);
                int index = Integer.parseInt(separateCommand[2]);
                numberList.add(index, addElement);


            }


            command = scanner.nextLine();


        }

        System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));


    }


}
