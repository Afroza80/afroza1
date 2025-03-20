import java.util.Scanner; // Import Scanner class to take user input

public class Afroza6a {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); // Read user input

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
