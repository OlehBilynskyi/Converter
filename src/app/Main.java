package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("A tool for converting miles to kilometers and kilometers to miles.");
        double miles = 10;
        double kilometers = convertMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " km");
    }
    public static double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
