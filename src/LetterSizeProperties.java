public class LetterSizeProperties {
    public static void main(String[] args) {
        double width = constant.WIDTH_INCHES * constant.INCHES_TO_MILLIMETER;
        double height = constant.HEIGHT_INCHES * constant.INCHES_TO_MILLIMETER;

        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Width:  " + width + " millimeters");
        System.out.println("Height: " + height + " millimeters");
        System.out.println("Perimeter: " + perimeter + " millimeters");
        System.out.println("Diagonal: " + diagonal + " millimeters");

    }


}
