import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoritBook = scanner.nextLine();
        String book = scanner.nextLine();
        int count = 0;


        while (!book.equals("No More Books")) {
            if (favoritBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            }


            count++;
            book = scanner.nextLine();
        }
        if (book.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }

    }


}

