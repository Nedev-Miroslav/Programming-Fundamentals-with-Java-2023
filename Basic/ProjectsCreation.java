import java.util.Scanner;


public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int hour = project * 3;
        System.out.println("The architect " + name +   " will need " + hour + " hours to complete " + project + " project/s.");

    }
}
