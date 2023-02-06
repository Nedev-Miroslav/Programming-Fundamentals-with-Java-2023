package W04ExeciseMethods;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s1 = scanner.nextLine().charAt(0);
        char s2 = scanner.nextLine().charAt(0);
        printFromCharToChar(s1, s2);



    }
    public static void printFromCharToChar (char symbol1, char symbol2) {
     if (symbol1 > symbol2) {
         for (int i = (int) symbol2 + 1; i < (int)symbol1; i++) {
             System.out.print((char)i + " ");
         }
     } else {
         for (int i = (int) symbol1 + 1; i < (int)symbol2; i++) {
             System.out.print((char)i + " ");
         }
     }





    }




}
