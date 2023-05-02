import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int sum = 0;
        int seaCont = 0;
        int mountCount = 0;

        while (!input.equals("Stop")) {
            String vacantion = input;

            if(vacantion.equals("sea")) {
                seaCont++;
            } else if (vacantion.equals("mountain")) {
                mountCount++;
            }


            if (vacantion.equals("sea") && sea >= seaCont) {
                sum = sum + 680;

            } else if (vacantion.equals("mountain") && mount >= mountCount) {
                sum = sum + 499;

            }
            if (seaCont >= sea && mountCount >= mount) {
                break;
            }

            input = scanner.nextLine();
        }


        if(input.equals("Stop")) {
            System.out.printf("Profit: %d leva.", sum);
        } else {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.", sum);
        }


    }
}
