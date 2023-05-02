import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animaitor =  rent / 3;

        double costs = rent + cake + drinks + animaitor;

        System.out.println(costs);




    }
}
