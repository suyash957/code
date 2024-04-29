
import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // Reading double input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Reading string input
        System.out.print("Enter a string: ");
        String stringValue = scanner.next(); // Reads only one word
        // String stringValue = scanner.nextLine(); // Reads entire line
        System.out.println("You entered: " + stringValue);

        // Reading character input
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0); // Reads only the first character
        System.out.println("You entered: " + charValue);

        // Reading boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered: " + booleanValue);

        // Close the scanner
        scanner.close();
    }
}
