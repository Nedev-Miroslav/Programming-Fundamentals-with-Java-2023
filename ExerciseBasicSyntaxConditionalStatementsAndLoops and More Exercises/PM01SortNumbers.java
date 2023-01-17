package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PM01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        int biggestNum = 0;
        int middleNum = 0;
        int smallNum = 0;


        if (num1 >= num2 && num1 >= num3) {
            biggestNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            biggestNum = num2;
        } else {
            biggestNum = num3;
        }


        if (num1 <= num2 && num1 <= num3) {
            smallNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallNum = num2;
        } else {
            smallNum = num3;
        }


        if (num1 != biggestNum && num1 != smallNum) {
            middleNum = num1;
        } else if (num2 != biggestNum && num2 != smallNum) {
            middleNum = num2;
        } else if (num3 != biggestNum && num3 != smallNum) {
            middleNum = num3;
        } else if (num1 == num2) {
            middleNum = num1;
        } else if (num1 == num3) {
            middleNum = num3;
        } else {
            middleNum = num2;
        }



        System.out.println(biggestNum);
        System.out.println(middleNum);
        System.out.println(smallNum);


    }
}
