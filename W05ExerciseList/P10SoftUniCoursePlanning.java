package W05ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String command = scanner.nextLine();


        while (!command.equals("course start")) {
            String[] separateCommand = command.split(":");
            String exercise = separateCommand[1];
            String fullExerciseName = exercise + "-Exercise";

            if (command.contains("Add")) {
                String addLesson = separateCommand[1];
                if (!lessonsList.contains(addLesson)) {
                    lessonsList.add(addLesson);

                }


            } else if (command.contains("Insert")) {
                String insertLesson = separateCommand[1];
                int indexInsert = Integer.parseInt(separateCommand[2]);
                if (!lessonsList.contains(insertLesson)) {
                    if (indexInsert >= 0 && indexInsert <= lessonsList.size() - 1) {
                        lessonsList.add(indexInsert, insertLesson);

                    }
                }


            } else if (command.contains("Remove")) {
                String removeLesson = separateCommand[1];
                if (lessonsList.contains(removeLesson)) {
                    lessonsList.remove(removeLesson);

                }
                if (lessonsList.contains(removeLesson + "-Exercise")) {
                    lessonsList.remove(removeLesson + "-Exercise");
                }


            } else if (command.contains("Swap")) {
                String swapLesson1 = separateCommand[1];
                String swapLesson2 = separateCommand[2];
                int index1 = 0;
                int index2 = 0;

                if (lessonsList.contains(swapLesson1) && lessonsList.contains(swapLesson2)) {
                    for (int i = 0; i < lessonsList.size(); i++) {
                        if (lessonsList.get(i).equals(swapLesson1)) {
                            index1 = i;
                        }
                        if (lessonsList.get(i).equals(swapLesson2)) {
                            index2 = i;
                        }


                    }
                    lessonsList.set(index1, swapLesson2);
                    lessonsList.set(index2, swapLesson1);
                    if (lessonsList.contains(swapLesson2 + "-Exercise")) {
                        lessonsList.remove(swapLesson2 + "-Exercise");
                        lessonsList.add(index1 + 1, swapLesson2 + "-Exercise");

                    }
                    if (lessonsList.contains(swapLesson1 + "-Exercise")) {
                        lessonsList.remove(swapLesson1 + "-Exercise");
                        lessonsList.add(index2 + 1, swapLesson1 + "-Exercise");
                    }

                }


            } else if (command.contains("Exercise")) {

                if (lessonsList.contains(exercise) && !lessonsList.contains(fullExerciseName)) {
                    int indexExercise = 0;
                    for (int i = 0; i < lessonsList.size(); i++) {
                        if (lessonsList.get(i).equals(exercise)) {
                            indexExercise = i;
                        }
                    }
                    lessonsList.add(indexExercise + 1, fullExerciseName);

                }


                if (!lessonsList.contains(exercise)) {
                    lessonsList.add(exercise);
                    lessonsList.add(fullExerciseName);
                }


            }


            command = scanner.nextLine();

        }


        for (int i = 0; i < lessonsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lessonsList.get(i));
        }

    }
}
