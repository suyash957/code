/*Write a program in java to show the use of finally keyword.*/

public class Finally {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed, regardless of exceptions.");
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
