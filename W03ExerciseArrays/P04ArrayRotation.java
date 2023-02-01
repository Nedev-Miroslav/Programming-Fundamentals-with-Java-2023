package W03ExerciseArrays;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= rotation; i++) {
            String firstElement = inputArr[0];
            for (int j = 0; j < inputArr.length - 1; j++) {
                inputArr[j] = inputArr[j + 1];
            }
            inputArr[inputArr.length - 1] = firstElement;

        }

        System.out.println(String.join(" ", inputArr));

    }
}
