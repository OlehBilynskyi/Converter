package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("This application converts temperatures between Fahrenheit and Celsius.");

        double f = 98.6;
        double c = convertFahrenheitToCelsius(f);
        System.out.println(f + "°F = " + c + "°C");
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
