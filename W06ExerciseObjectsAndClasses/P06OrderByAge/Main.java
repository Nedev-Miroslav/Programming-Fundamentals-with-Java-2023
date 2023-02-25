package W06ExerciseObjectsAndClasses.P06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!command.equals("End")) {
            String name = command.split("\\s+")[0];
            String ID = command.split("\\s+")[1];
            int age = Integer.parseInt(command.split("\\s+")[2]);

            Person person = new Person(name, ID, age);
            personList.add(person);





            command = scanner.nextLine();
        }

        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.println(person);

        }


    }
}
