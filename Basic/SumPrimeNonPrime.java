import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // команда ИЛИ число
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input); // ако не е командата stop, ще е число
            boolean isPrime = true; // дали числото е просто или не - ако е просто НЕ ПРОМЕНЯМ boolean, ако НЕ Е просто - isPrime = false

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < num; i++) { // започвам моя цикъл от НАЙ-МАЛКОТО ПРОСТО ЧИСЛО до моя num
                if (num % i == 0) { // ако числото, което сме задали % i == 0
                    isPrime = false; // моето число не е просто
                    break;
                }
            }
            if (isPrime) { // ако числото ми е просто
                sumPrime += num;
            } else {
                sumNonPrime += num;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}