import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        // Circle calculations
        double circleArea = Math.PI * Math.pow(radius, 2);
        double circleCircumference = 2 * Math.PI * radius;

        // Sphere calculations
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Circle:");
        System.out.printf("Area: %.2f\n", circleArea);
        System.out.printf("Circumference: %.2f\n", circleCircumference);

        System.out.println("\nSphere:");
        System.out.printf("Volume: %.2f\n", sphereVolume);
        System.out.printf("Surface Area: %.2f\n", sphereSurfaceArea);

    }
}
