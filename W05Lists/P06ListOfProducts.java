package W05Lists;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            products.add(scanner.nextLine());

        }
        Collections.sort(products);

        for (int i = 0; i < n ; i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}