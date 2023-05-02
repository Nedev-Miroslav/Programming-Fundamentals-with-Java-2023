import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
 //       String comand = scanner.nextLine();

        int freeSpace = wight * length * high;
        int countSpace = 0;

//        while (!comand.equals("Done")) {
//            int space = Integer.parseInt(comand);
//            countSpace = countSpace + space;
//
//            if (countSpace > freeSpace) {
//                System.out.printf("No more free space! You need %d Cubic meters more.", countSpace - freeSpace);
//                break;
//            }
//
//            comand = scanner.nextLine();
//        }
//        if (comand.equals("Done")) {
//            System.out.printf("%d Cubic meters left.", freeSpace - countSpace);
//        }

        while (freeSpace >= countSpace) {
            String comand = scanner.nextLine();
            if (comand.equals("Done")) {
                System.out.printf("%d Cubic meters left.", freeSpace - countSpace);
                break;
            }
            int space = Integer.parseInt(comand);
            countSpace = countSpace + space;


        } if (countSpace > freeSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", countSpace - freeSpace);

        }




    }
}