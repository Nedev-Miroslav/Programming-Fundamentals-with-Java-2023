package W08ExerciseTextProcessing;

import java.util.Calendar;
import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split("\\s+");
        double totalSum = 0.0;


        for (int i = 0; i < inputArr.length; i++) {

            StringBuilder sb = new StringBuilder();

            String current = inputArr[i];

            sb.append(current);

            char firstLetter = sb.charAt(0);
            char secondLetter = sb.charAt(current.length() - 1);

            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);
            double num = Double.parseDouble(sb.toString());


            if (firstLetter >= 65 && firstLetter <= 90) {
                double divide = firstLetter - 64;

                num = num / divide;


            } else if (firstLetter >= 97 && firstLetter <= 122) {
                double multiply = firstLetter - 96;
                num = num * multiply;

            }


            if (secondLetter >= 65 && secondLetter <= 90) {
                double subtract = secondLetter - 64;

                num = num - subtract;


            } else if (secondLetter >= 97 && secondLetter <= 122) {
                double add = secondLetter - 96;
                num = num + add;

            }


            totalSum += num;


        }

        System.out.printf("%.2f", totalSum);



    }
}
