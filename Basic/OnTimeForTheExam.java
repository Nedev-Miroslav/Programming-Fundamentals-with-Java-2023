import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutExam = Integer.parseInt(scanner.nextLine());
        int hourCome = Integer.parseInt(scanner.nextLine());
        int minutCome = Integer.parseInt(scanner.nextLine());

        int totalExam = hourExam * 60 + minutExam;
        int totalCome = hourCome * 60 + minutCome;

        int minusTime = totalExam - totalCome;

        if (minusTime == 0) {
            System.out.printf("On time");
        } else if (minusTime > 0 && minusTime <= 30) {
            System.out.printf("On time %d minutes before the start", Math.abs(minusTime));
        } else if (minusTime < 0) {
            minusTime = Math.abs(minusTime);
            System.out.println("Late");
            if (minusTime >= 60) {
                hourExam = minusTime / 60;
                minutExam = minusTime % 60;
                System.out.printf("%d:%02d hours after the start", hourExam, minutExam);
            } else {
                System.out.printf("%d minutes after the start", minusTime);
            }

        } else {
            System.out.println("Early");

            if (minusTime >= 60) {
                hourExam = minusTime / 60;
                minutExam = minusTime % 60;
                System.out.printf("%d:%02d hours before the start", hourExam, minutExam);
            } else {
                System.out.printf("%d minutes before the start", minusTime);
            }
        }




        }
    }
