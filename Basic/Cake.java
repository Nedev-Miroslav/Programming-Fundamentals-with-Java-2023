import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cake = wight * length;
        int pieces = 0;


        while (cake >= pieces) {
            String comand = scanner.nextLine();
            if (comand.equals("STOP")) {
                System.out.printf("%d pieces are left.", cake - pieces);
                break;
            }
            int taken = Integer.parseInt(comand);
            pieces = pieces + taken;






        }   if (pieces > cake) {
            System.out.printf("No more cake left! You need %d pieces more.", pieces - cake);
        }
    }
}
