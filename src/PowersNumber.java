import java.util.Scanner;
public class PowersNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        double square = number * number;
        double cube = number * square;
        double fourthPower = Math.pow(number, 4);

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);
    }
}
