import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double average_rating = 0;
        double note = 0;
        int TotalNotes = 0;

        while (note != -1) {
            System.out.println("From little stars of recommendations to the book or minus -1 to end ");
            note = reading.nextDouble();

            if (note != -1) {
                average_rating += note;
                TotalNotes++;

            }

            System.out.println("Average ratings " + average_rating / TotalNotes);
        }
    }
}
