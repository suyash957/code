
public class NestedTryExample {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: Cannot divide by zero!");
            }
            int[] arr = new int[5];
            int value = arr[10]; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch block: Array index is out of bounds!");
        }
    }
}