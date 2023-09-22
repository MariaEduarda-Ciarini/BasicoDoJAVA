import java.util.Scanner;

public class extrato {
    public static void main(String[] args) {
        String name = "Jhonson";
        String account_type = "Current";
        double balance = 900;
        int option = 0;

        System.out.println(" ********************** ");
        System.out.println("\nClient name: " + name);
        System.out.println("Account type: " + account_type);
        System.out.println("Current Balance: " + balance);
        System.out.println("\n**********************");

        String menu = """
                *** Enter your option ***
                1 - Check balance
                2 - Faz O Pix!
                3 - Receive value
                4 - EXIT

                """;

        Scanner reading = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println("The updated balance is " + balance);

            } else if (option == 2) {
                System.out.println("What value do you want to make the pix?");
                double value = reading.nextDouble();
                if (value > balance) {
                    System.out.println("There is no balance to make the transfer");
                } else {
                    balance -= value;
                    System.out.println("New BALANCE" + balance);
                }
            } else if (option == 3) {
                System.out.println("Amount received: ");
                double value = reading.nextDouble();
                balance += value;
                System.out.println("New BALANCE" + balance);
            } else if (option != 4) {
                System.out.println("Invalid Option");
            }
        }
    }
}