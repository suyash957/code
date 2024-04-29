/* Write a program in java to handle below exceptions
a. Divide by Zero
b. Array Index Out Of Bound
c. Number Format
d. Null Pointer */ 

import java.util.Scanner;

public class Exceptions{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int[] arr = new int[5];
        String str;
        try{
            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("Division of two numbers is: "+c);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero exception");

        }
        try{
            System.out.println("Enter the index of array: ");
            int index = sc.nextInt();
            System.out.println("Enter the value of array: ");
            arr[index] = sc.nextInt();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
        try{
            System.out.println("Enter a nmber: ");
            str = sc.next();
            int num = Integer.parseInt(str);
            System.out.println("Number is : "+num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception");

        }
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception");
        }


    }
} 


    
