import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minuts = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calory = Integer.parseInt(scanner.nextLine());

        int sumWalsInMinuts = walks * minuts;
        int burncalory = sumWalsInMinuts * 5;

        double needToBurn = calory * 0.5;

        if (burncalory >= needToBurn) {
        System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burncalory);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burncalory);
        }


    }
}
