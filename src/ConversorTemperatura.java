import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("The temperature in Fahrenheit is: " + temperaturaFahrenheit);

        scanner.close();
    }
}

