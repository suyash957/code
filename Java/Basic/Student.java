import java.util.Scanner;

class Student{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter Name => ");
        String name = data.nextLine();

        System.out.println("Enter PRN No => ");
        int prn = data.nextInt();

        System.out.println("What is your CGPA : ");
        double GPA = data.nextDouble();

        System.out.println("My name is : " + name);
        System.out.println("My PRN is : " + prn);
        System.out.println("My GPA is : " + GPA);
        
        data.close();
    }
}