import java.util.Scanner;
import  java.lang.String;

public class CommaWithoutNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        int number = scanner.nextInt();

        //valid input range
        if (number < 1000 || number > 999999) {
            System.out.println("Invalid input: Please enter a number between 1,000 and 999,999.");
            return;
        }

        // Use String.format to format with comma
        String formattedNumber = String.format("%,d", number);

        // Print formatted number
        System.out.println(formattedNumber);
    }
}
