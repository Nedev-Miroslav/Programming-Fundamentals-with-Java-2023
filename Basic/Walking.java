import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int sumSteps = 0;

        while (goal > sumSteps) {
            String comand = scanner.nextLine();
            if (comand.equals("Going home")) {
                int stepsHone = Integer.parseInt(scanner.nextLine());
                sumSteps = sumSteps + stepsHone;
                break;
            }
            int steps = Integer.parseInt(comand);
            sumSteps = sumSteps + steps;

        }
        if (goal < sumSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(sumSteps - goal));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(goal - sumSteps));
        }

    }
}
