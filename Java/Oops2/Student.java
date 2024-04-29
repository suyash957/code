
public class Student {
    private static String prn = "1234567890";
    private static String name = "John Doe";
    private static int age = 20;
    private static String address = "123 Main Street, City, Country";
    private static String className = "Computer Science";

    static {
        System.out.println("PRN: " + prn);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Class: " + className);
    }
}
