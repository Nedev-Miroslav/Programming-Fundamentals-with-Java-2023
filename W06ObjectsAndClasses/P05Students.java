package W06ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Students {
        private String firstName;
        private String lastName;
        private String age;
        private String homeTown;

        public Students(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Students> allStudentsList = new ArrayList<>();
        while (!input.equals("end")) {
            String[] students = input.split("\\s+");
            Students currentStudent = new Students(students[0], students[1], students[2], students[3]);
            allStudentsList.add(currentStudent);


            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Students students : allStudentsList) {
            if (town.equals(students.getHomeTown())) {
                System.out.printf("%s %s is %s years old%n", students.getFirstName(), students.getLastName(), students.getAge());
            }
        }


    }
}
