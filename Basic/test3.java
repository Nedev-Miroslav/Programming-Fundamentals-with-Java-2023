import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String quantity = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;


        switch (fruit) {
            case "Watermelon":
                if(quantity.equals("small")) {
                    sum = count * 56 * 2;
                } else if (quantity.equals("big")) {
                    sum = count * 28.70 * 5;
                }
                break;
            case  "Mango":
                if(quantity.equals("small")) {
                    sum = count * 36.66 * 2;
                } else if (quantity.equals("big")) {
                    sum = count * 19.60 * 5;
                }
                break;
            case "Pineapple":
                if(quantity.equals("small")) {
                    sum = count * 42.10 * 2;
                } else if (quantity.equals("big")) {
                    sum = count * 24.80 * 5;
                }
                break;
            case "Raspberry":
                if(quantity.equals("small")) {
                    sum = count * 20 * 2;
                } else if (quantity.equals("big")) {
                    sum = count * 15.20 * 5;
                }
                break;



        } if(sum >= 400 && sum <= 1000) {
            sum = sum * 0.85;
        } else if (sum > 1000) {
            sum = sum * 0.5;
        }


        System.out.printf("%.2f lv.", sum);

    }
}
