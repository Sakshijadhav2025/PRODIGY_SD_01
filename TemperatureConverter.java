import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double val = sc.nextDouble();

        System.out.println("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char unit = sc.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                convertFromCelsius(val);
                break;
            case 'F':
                convertFromFahrenheit(val);
                break;
            case 'K':
                convertFromKelvin(val);
                break;
            default:
                System.out.println("Invalid unit entered.");
        }
    }

    static void convertFromCelsius(double c) {
        double f = (c * 9/5) + 32;
        double k = c + 273.15;
        System.out.printf("Fahrenheit: %.2f, Kelvin: %.2f%n", f, k);
    }

    static void convertFromFahrenheit(double f) {
        double c = (f - 32) * 5/9;
        double k = c + 273.15;
        System.out.printf("Celsius: %.2f, Kelvin: %.2f%n", c, k);
    }

    static void convertFromKelvin(double k) {
        double c = k - 273.15;
        double f = (c * 9/5) + 32;
        System.out.printf("Celsius: %.2f, Fahrenheit: %.2f%n", c, f);
    }
}