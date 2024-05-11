import java.util.Scanner;
import  java.lang.String;

public class CommaWithNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String numberStr = scanner.nextLine();

        // Validate input length (assuming comma is present)
        if (numberStr.length() != 7) {
            System.out.println("Invalid input: Please enter a number between 1,000 and 999,999 with a comma.");
            return;
        }

        // Extract number without comma
        String numberWithoutComma = numberStr.substring(0, numberStr.length() - 3) + numberStr.substring(numberStr.length() - 2);

        // Convert string to integer
        int number = Integer.parseInt(numberWithoutComma);

        System.out.println("Number without comma: " + number);
    }
}
