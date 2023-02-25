package W06ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {


    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String homeTown;

        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
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

        List<Student> allStudentsList = new ArrayList<>();
        while (!input.equals("end")) {
            String[] students = input.split("\\s+");
            String firstName = students[0];
            String lastName = students[1];
            String age = students[2];
            String town = students[3];
            if (!isExsist(firstName, lastName, age, town, allStudentsList)) {
                Student currentStudent = new Student(firstName, lastName, age, town);
                allStudentsList.add(currentStudent);
            }



            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student students : allStudentsList) {
            if (town.equals(students.getHomeTown())) {
                System.out.printf("%s %s is %s years old%n", students.getFirstName(), students.getLastName(), students.getAge());
            }
        }


    }

    private static boolean isExsist(String firstName, String lastName, String age, String town, List<Student> allStudentsList) {
        for (Student student : allStudentsList) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                student.setAge(age);
                student.setHomeTown(town);
                return true;
            }
        }
        return false;
    }
}


