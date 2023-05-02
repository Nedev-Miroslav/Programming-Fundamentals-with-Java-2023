import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        while (!name.equals("Stop")) {

            System.out.println(name);
            name = scanner.nextLine();
        }
//        while (true) {
//            if (name.equals("Stop")) {
//                break;
//            }
//            System.out.println(name);
//            name = scanner.nextLine();
//
//        }


    }
}
