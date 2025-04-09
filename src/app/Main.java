package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("A tool for converting miles to kilometers and kilometers to miles.");
        double miles = 10;
        double kilometers = convertMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " km");

        double km = 5;
        double mi = convertKilometersToMiles(km);
        System.out.println(km + " km = " + mi + " miles");
    }

    public static double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }
    public static double convertKilometersToMiles(double kilometers) {
        return  kilometers / 1.60934;
    }
}
