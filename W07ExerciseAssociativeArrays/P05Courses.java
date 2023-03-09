package W07ExerciseAssociativeArrays;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> courseMap = new LinkedHashMap<>();

        while (!command.equals("end")) {
            String subject = command.split(" : ")[0];
            String student = command.split(" : ")[1];

            if (!courseMap.containsKey(subject)) {
                courseMap.put(subject, new ArrayList<>());
            }

            courseMap.get(subject).add(student);


            command = scanner.nextLine();
        }


        for (Map.Entry<String, ArrayList<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (String s : entry.getValue()) {
                System.out.printf("-- %s%n", s);
            }
        }


    }
}
