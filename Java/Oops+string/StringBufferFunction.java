public class StringBufferFunction{
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Hello");

        //Append
        str.append(" Shreyas");
        System.out.println("Appended string is: "+ str);

        //insert
        str.insert(5,"OO ");
        System.out.println("Inserted string is : "+ str);

        //replace
        str.replace(5,7," ");
        System.out.println("Replaced from string 5 to 7 is: "+ str);

        //delete
        str.delete(5,7);
        System.out.println("Deleted from string 5 to 7 is: "+ str);

        //reverse
        str.reverse();
        System.out.println("Reversed string is: "+ str);

        //Length
        int Length = str.length();
        System.out.println("Length of the string is: "+ Length);

        //Capacity
        int capacity = str.capacity();
        System.out.println("Capacity of the string is: "+ capacity);

        //SetLength
        str.setLength(5);
        System.out.println("Set length of the string is: "+ str);

        //EnsureCapacity
        str.ensureCapacity(50);
        System.out.println("Ensured capacity of the string is: "+ str);

        //Get char at index
        char charAtIndex = str.charAt(3);
        System.out.println("Character at index 3 is: "+ charAtIndex);

        //Substring
        String subString = str.substring(4);
        System.out.println("Substring from index 6 is: "+ subString);

       



    }
}