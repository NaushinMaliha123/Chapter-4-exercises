import java.util.Scanner;

public class GasCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallons = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter the price of gas per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // Calculate cost per 100 miles
        double costPerHundredMiles = Math.abs((pricePerGallon / milesPerGallon) * 100);

        // Calculate distance car can travel
        double distance = Math.abs(gallons * milesPerGallon);

        System.out.printf("Cost per 100 miles: %.2f\n", costPerHundredMiles);
        System.out.printf("Distance car can travel: %.2f miles\n", distance);
    }
}
