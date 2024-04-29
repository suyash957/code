/*Write a program to calculate the factorial of a number. (The number is
passed as the command-line argument whose factorial we need to
calculate)*/


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.err.println("Invalid input. Please enter an integer.");
            System.exit(1);
        }
        scanner.close();

        long result = calculateFactorial(number);

        System.out.printf("The factorial of %d is: %d%n", number, result);
    }

    private static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}