package W06ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        Random random = new Random();
        for (int i = 0; i < inputArr.length; i++) {
            int index1 = random.nextInt(inputArr.length);
            int index2 = random.nextInt(inputArr.length);
            String currentElement1 = inputArr[index1];
            String currentElement2 = inputArr[index2];

            inputArr[index1] = currentElement2;
            inputArr[index2] = currentElement1;


        }
        System.out.println(String.join(System.lineSeparator(), inputArr));


    }
}
