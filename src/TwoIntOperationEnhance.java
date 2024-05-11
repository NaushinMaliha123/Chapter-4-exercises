import java.util.Scanner;
public class TwoIntOperationEnhance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;

        int product = number1 * number2;
        double average = (double) (number1 + number2) / 2;
        int distance = Math.abs(difference);

        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);

        System.out.println("Sum:        " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product:    " + product);
        System.out.printf("Average:    %.2f%n", average);
        System.out.println("Distance:   " + distance);
        System.out.println("Maximum:    " + max);
        System.out.println("Minimum:    " + min);

    }
}

