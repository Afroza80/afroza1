public class Afroza6b7 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 23}; // Example array
        int max = arr[0]; // Assume first element is the largest
        for (int num : arr) { // Loop through each element
            if (num > max) max = num; // Update max if a larger value is found
        }
        System.out.println("Largest number: " + max); // Print the largest number
    }
}
