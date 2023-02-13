package W05Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> inputLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < inputLine.size() - 1; i++) {
            double currentNum = inputLine.get(i);
            double nextNum = inputLine.get(i + 1);
            if (currentNum == nextNum) {
                double sum = currentNum + nextNum;
                inputLine.set(i, sum);
                inputLine.remove(i + 1);
                i = -1;
            }


        }

        for (int i = 0; i < inputLine.size(); i++) {
            System.out.print(new DecimalFormat("0.# ").format(inputLine.get(i)));
        }


    }
}
