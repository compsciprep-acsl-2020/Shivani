import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose C to convert from Celsius to Fahrenheit OR Choose F to convert from Fahrenheit to Celsius: ");
        String conversionType = input.next();

        if (conversionType.equals("C")) {
            System.out.println("Enter the Celsius Value: ");
            double celsius = input.nextDouble();
            double fahrenheit = 9/5 * celsius + 32;
            System.out.println("The Fahrenheit value is " + fahrenheit + ", when the Celsius value is " + celsius + ".");
        }

        else if (conversionType.equals("F")) {
            System.out.println("Enter the Fahrenheit Value: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;

            System.out.println("The Celsius value is " + celsius + ", when the Fahrenheit value is " + fahrenheit + ".");

            input.close();
        }
    }
}