package W03ExerciseArrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] inputArr1 = input1.split(" ");
        String[] inputArr2 = input2.split(" ");

        for (String s2 : inputArr2) {
            for (String s1 : inputArr1) {
                if (s2.equals(s1)) {
                    System.out.printf("%s ", s2);
                }
            }
        }


    }


}
