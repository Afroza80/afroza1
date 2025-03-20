public class Afroza6b8 {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 6, 2, 5};  // Step 1: Create an array with numbers
        for(int i = 0; i < numbers.length - 1; i++) {  // Step 2: Outer loop for passes
            for(int j = 0; j < numbers.length - 1 - i; j++) {  // Step 3: Inner loop for comparisons
                if(numbers[j] > numbers[j + 1]) {  // Step 4: Swap if the left number is greater
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Numbers: ");
        for(int num : numbers) {  // Step 5: Print sorted array
            System.out.print(num + " ");
        }
    }
}
