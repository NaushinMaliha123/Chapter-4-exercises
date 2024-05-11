import java.util.Scanner;
public class TwoIntegerOperation {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number1 = input.nextInt();
       int number2 = input.nextInt();

       int sum = number1 + number2;
       int difference = Math.abs(number1 - number2);

       int product = number1 * number2;
       double average = (double) (number1 + number2) / 2;

       int max = Math.max(number1, number2);
       int min = Math.min(number1, number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + difference);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
