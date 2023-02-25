package W06ExerciseObjectsAndClasses.P02Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(", ");
        List<Article> articleList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());


        String title = inputArr[0];
        String content = inputArr[1];
        String author = inputArr[2];

        Article article = new Article(title, content, author);
        articleList.add(article);
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if(command.contains("Edit")) {
            String edit = command.split(": ")[1];
            article.edit(edit);

            
        } else if (command.contains("ChangeAuthor")) {
            String changeAuthor = command.split(": ")[1];
            article.changeAuthor(changeAuthor);
            
        } else if (command.contains("Rename")) {
            String rename = command.split(": ")[1];
                article.rename(rename);
        }


        }

        System.out.printf("%s - %s: %s",article.getTitle(), article.getContent(), article.getAuthor() );


    }
}
