import java.util.Scanner;

public class RectangularProperties {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        System.out.printf("Area:%.2f\n",area);
        System.out.printf("Perimeter:%.2f\n", perimeter);
        System.out.printf("Diagonal:%.2f\n ", diagonal);
    }
}

