import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int year = 1;
        double sumGrade = 0.0;
        int poorGrade = 0;

        while (year <= 12) {
            if (poorGrade > 1) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGrade++;
                continue;
            }


            sumGrade = sumGrade + grade;

            year++;

        }
        if (poorGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double averageGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }


    }
}
