package W05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] commandContains = command.split(" ");
            String indexcommand = commandContains[0];

            if (indexcommand.equals("Contains")) {

                int containsOrNot = Integer.parseInt(commandContains[1]);
                if (numberList.contains(containsOrNot)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print even")) {
                for (int i = 0; i < numberList.size(); i++) {
                    if (numberList.get(i) % 2 == 0) {
                        System.out.print(numberList.get(i) + " ");
                    }
                }
                System.out.println();

            } else if (command.equals("Print odd")) {
                for (int i = 0; i < numberList.size(); i++) {
                    if (numberList.get(i) % 2 != 0) {
                        System.out.print(numberList.get(i) + " ");
                    }
                }
                System.out.println();

            } else if (command.equals("Get sum")) {
                int sum = 0;
                for (int i = 0; i < numberList.size(); i++) {
                    sum += numberList.get(i);
                }
                System.out.println(sum);

            } else if (indexcommand.equals("Filter")) {
                String condition = commandContains[1];
                int number = Integer.parseInt(commandContains[2]);
                switch (condition) {
                    case "<":
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) < number) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();

                        break;
                    case ">":
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) > number) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();

                        break;
                    case ">=":
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) >= number) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();

                        break;
                    case "<=":
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) <= number) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();

                        break;

                }

            }

            command = scanner.nextLine();
        }

    }
}
