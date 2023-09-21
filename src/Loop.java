import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double average_rating = 0;
        double note = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("From little stars of recommendations to the book ");
            note = reading.nextDouble();
            average_rating += note;

        }
        System.out.println("Average ratings " + average_rating / 3);
    }
}
