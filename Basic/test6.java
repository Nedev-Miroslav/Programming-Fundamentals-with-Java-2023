import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allSum = 0;

        int allDayWin = 0;
        int allDayLose = 0;


        for (int i = 1; i <= days; i++) {

            int dayWinCount = 0;
            int dayLoseCount = 0;

            String input = scanner.nextLine();
            int daySum = 0;



            while (!input.equals("Finish")) {
                String sports = input;
                String result = scanner.nextLine();


                if (result.equals("win")) {
                    dayWinCount++;
                    daySum += 20;
                } else if (result.equals("lose")) {
                    dayLoseCount++;
                }




                input = scanner.nextLine();
            } if (dayWinCount > dayLoseCount) {
                daySum = daySum + daySum * 10 / 100;
                allDayWin++;
            } else if (dayWinCount < dayLoseCount) {
                allDayLose++;
            }
                allSum = allSum + daySum;
        }
        if (allDayWin > allDayLose) {
            allSum = allSum + allSum * 20 / 100.0;
            System.out.printf("You won the tournament! Total raised money: %.2f", allSum);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", allSum);
        }



    }
}
