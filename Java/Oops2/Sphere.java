import java.util.Scanner;

public class Sphere {
    private static final double PI = 3.14159265359;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        System.out.println("Area of the sphere: " + calculateArea(radius));
        System.out.println("Volume of the sphere: " + calculateVolume(radius));

        scanner.close();
    }

    public static double calculateArea(double radius) {
        return 4 * PI * radius * radius;
    }

    public static double calculateVolume(double radius) {
        return (4.0 / 3) * PI * Math.pow(radius, 3);
    }
}
