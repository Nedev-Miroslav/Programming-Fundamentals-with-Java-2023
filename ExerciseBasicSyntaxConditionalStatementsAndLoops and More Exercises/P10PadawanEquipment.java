package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBelt = studentsCount / 6;


        double neededSum =(lightsabersPrice *  Math.ceil(studentsCount * 1.1)) +
                studentsCount * robesPrice + studentsCount * beltPrice - freeBelt * beltPrice;


        if (amountOfMoney >= neededSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededSum - amountOfMoney);
        }



    }
}
