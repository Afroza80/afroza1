import java.util.Scanner;

public class Afroza6b6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();
        input.close();

        String season;
        switch (month) {
            case 3, 4: season = "Spring (Bashanta)"; break;
            case 5, 6: season = "Summer (Grishmo)"; break;
            case 7, 8: season = "Monsoon (Barsha)"; break;
            case 9, 10: season = "Autumn (Sharat)"; break;
            case 11, 12: season = "Late Autumn (Hemanto)"; break;
            case 1, 2: season = "Winter (Sheet)"; break;
            default: season = "Invalid month"; break;
        }

        System.out.println("Bangla Season: " + season);
    }
}
