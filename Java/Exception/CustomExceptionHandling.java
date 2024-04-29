/*Write a program in java to handle custom exception with single try block
and multiple catch block.*/

// 2. Program to handle custom exception with single try block and multiple catch
// blocks:
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
            String str = "abc";
            int num = Integer.parseInt(str); // NumberFormatException
            int[] arr = new int[5];
            int value = arr[10]; // ArrayIndexOutOfBoundsException
            String nullStr = null;
            System.out.println(nullStr.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("Object is null!");
        }
    }
}
