package W06ExerciseObjectsAndClasses.P01AdvertisementMessage;

import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."));

        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.",
               "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"));

        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));

        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));



        for (int i = 1; i <= n; i++) {
            int phraseIndex = random.nextInt(phrases.size());
            String phrase = phrases.get(phraseIndex);

            int eventsIndex = random.nextInt(events.size());
            String event = events.get(eventsIndex);


            int authorIndex = random.nextInt(authors.size());
            String author = authors.get(authorIndex);


            int citiIndex = random.nextInt(cities.size());
            String city = cities.get(citiIndex);

            System.out.printf("%s %s %s – %s%n", phrase, event, author, city);



        }


    }
}
