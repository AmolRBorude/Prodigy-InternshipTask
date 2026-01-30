import java.util.Scanner;

public class TemperatureConverter 
{

    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        double celsius, fahrenheit, kelvin;

        switch (choice) 
        {
            case 1: // Celsius
                celsius = value;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;
                break;

            case 2: // Fahrenheit
                fahrenheit = value;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                break;

            case 3: // Kelvin
                kelvin = value;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nConverted Temperatures:");
        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);

        sc.close();
    }
}
