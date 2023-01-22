package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());


        int fullCourse = countPeople / elevatorCapacity;
        int notFullCourse = countPeople % elevatorCapacity;
        if (notFullCourse > 0 && notFullCourse < elevatorCapacity) {
            notFullCourse = 1;
        }
        int allCourse = fullCourse + notFullCourse;
        System.out.println(allCourse);

    }
}
