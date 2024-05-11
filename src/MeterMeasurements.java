import java.util.Scanner;
public class MeterMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a distance number in meters: ");
        double meters = input.nextDouble();

        double miles = meters * constant.METERS_TO_MILES;
        double feet = meters * constant.METERS_TO_FEET;
        double inches = meters * constant.METERS_TO_INCHES;

        System.out.printf("%.4f miles\n", miles);
        System.out.printf("%.2f feet\n", feet);
        System.out.printf("%.2f inches\n", inches);

    }
}
