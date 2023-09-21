import java.util.Scanner;

public class reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter your favorite book: ");
        String book = reading.nextLine();
        System.out.println("Year of book release? ");
        int release_year = reading.nextInt();
        System.out.println("From little stars of recommendations to the book ");
        double rating = reading.nextDouble();

        System.out.println(book);
        System.out.println(release_year);
        System.out.println(rating);

    }
}
