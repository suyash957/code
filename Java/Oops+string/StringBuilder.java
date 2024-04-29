public class StringBuilder {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append method
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("After append: " + sb.toString());

        // Insert method
        sb.insert(5, ", ");
        System.out.println("After insert: " + sb.toString());

        // Delete method
        sb.delete(5, 7);
        System.out.println("After delete: " + sb.toString());

        // Replace method
        sb.replace(5, 6, " everyone");
        System.out.println("After replace: " + sb.toString());

        // Reverse method
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Length method
        int length = sb.length();
        System.out.println("Length of StringBuilder: " + length);

        // Capacity method
        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuilder: " + capacity);
    }
}
