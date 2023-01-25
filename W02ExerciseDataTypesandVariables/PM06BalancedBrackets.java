package W02ExerciseDataTypesandVariables;

import java.util.Scanner;

public class PM06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        scanner.nextLine();

        int bracketCount = 0;
        boolean isBalanced = true;
        for (int i = 0; i < numLines; i++) {
            String line = scanner.nextLine();
            if (line.equals("(")) {
                bracketCount++;
            } else if (line.equals(")")) {
                bracketCount--;
                if (bracketCount < 0) {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced && bracketCount == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
