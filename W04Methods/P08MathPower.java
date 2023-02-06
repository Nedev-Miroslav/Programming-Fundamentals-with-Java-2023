package W04Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(result(n1,n2)));



    }
    public static double result (double a, int b) {
        return Math.pow(a, b);



    }
}
