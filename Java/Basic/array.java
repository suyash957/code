//Write a Java program to check if there is a 10 in a given array of integers

public class array {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 12, 3, 6, 9, 11, 13, 15};
        boolean hasTen = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 10) {
                hasTen = true;
                break;
            }
        }
        
        if (hasTen) {
            System.out.println("There is a 10 in the array.");
        } else {
            System.out.println("There is no 10 in the array.");
        }
    }
}