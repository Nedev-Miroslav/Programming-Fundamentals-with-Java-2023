package W08ExerciseTextProcessing;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//         Решение със subString и indexOf
        String input = scanner.nextLine();


        int index = input.lastIndexOf("\\");
        String fileName = input.substring(index);


        int indexOfPoint = fileName.indexOf(".");
        String file = fileName.substring(1, indexOfPoint);
        String extension = fileName.substring(indexOfPoint + 1);


        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);


//          Втори начин за решение с масив

//        String [] inputArr = scanner.nextLine().split("\\\\");
//
//        String file = inputArr[inputArr.length - 1];
//
//        String name = file.split("\\.")[0];
//        String extension = file.split("\\.")[1];
//
//
//       System.out.println("File name: " + name);
//       System.out.println("File extension: " + extension);


    }
}
