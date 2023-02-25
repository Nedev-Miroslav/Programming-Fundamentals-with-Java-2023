package W06ExerciseObjectsAndClasses.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String [] inputArr = scanner.nextLine().split("\\s+");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            Person person = new Person(name, age);

                if(age > 30) {
                    personList.add(person);
                }

        }
        for (Person person : personList) {
            System.out.println(person);
        }




    }
}
