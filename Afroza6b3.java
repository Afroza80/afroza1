import java.util.Scanner;

public class Afroza6b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 0) ? -i : i;  // Subtract even numbers, add odd numbers
        }
        System.out.println("Sum of the series: " + sum);
        sc.close();
    }
}
