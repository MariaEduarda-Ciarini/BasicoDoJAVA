public class temperature {

    public static void main(String[] args){
        double temperatureInCelsius = 30.4;
        double temperatureInFahrenheit = (temperatureInCelsius * 1.8) + 32;

        String message = String.format("The temperature of %f Celsius é equivalente a %f Fahrenheit",
                temperatureInCelsius, temperatureInFahrenheit);

        System.out.println(message);

        int Temperature_in_Full_Fahrenheit = (int) temperatureInFahrenheit;
        System.out.println("The temperature in entire Fahrenheit is: " + temperatureInFahrenheit);
    }
}
