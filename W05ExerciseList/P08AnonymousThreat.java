package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] separateCommand = command.split(" ");

            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(separateCommand[1]);
                int endIndex = Integer.parseInt(separateCommand[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > stringList.size() - 1) {
                    endIndex = stringList.size() - 1;
                }

                if (startIndex >= 0 && startIndex <= stringList.size() - 1 && endIndex >= 0 && endIndex <= stringList.size()) {

                    String merge = "";

                    for (int i = startIndex; i <= endIndex; i++) {
                        merge += stringList.get(i);
                    }

                    for (int i = startIndex; i <= endIndex; i++) {
                        stringList.remove(startIndex);
                    }
                    stringList.add(startIndex, merge);

                }

            } else if (command.contains("divide")) {
                int index = Integer.parseInt(separateCommand[1]);
                int partitions = Integer.parseInt(separateCommand[2]);

                if (index >= 0 && index <= stringList.size() - 1) {

                    String textForDivide = stringList.get(index);
                    stringList.remove(index);

                    int countSymbolsPerPart = textForDivide.length() / partitions;
                    int beginIndex = 0;
                    for (int i = 1; i < partitions; i++) {
                        String textPerPart = textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        stringList.add(index, textPerPart);
                        index++;
                        beginIndex += countSymbolsPerPart;

                    }

                    String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                    stringList.add(index, textLastParts);

                }

            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", stringList));
    }
}