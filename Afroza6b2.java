import java.util.Scanner;

public class Afroza6b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++) { // Loop to calculate sum of squares of odd numbers
            int odd = 2 * i + 1;  // Generate odd number
            sum += odd * odd;  // Square and add to sum
        }
        
        System.out.println("Sum of series: " + sum);
        sc.close();
    }
}
