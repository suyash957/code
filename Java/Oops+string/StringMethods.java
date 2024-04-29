public class StringMethods{
    public static  void main(String[] args){
        String str = "Hello Shreyas";

        //Length of the string
        int Length = str.length();
        System.out.println("Length of the string is: "+ Length);

        //Character at a particular index
        char charAtIndex = str.charAt(6);
        System.out.println("Character at index 6 is: "+ charAtIndex);

        //substring
        String subString = str.substring(6);
        System.out.println("Substring from index 3 is: "+ subString);

        //Substring with start and end index
        String substringWithStartAndEndIndex = str.substring(6, 9);
        System.out.println("Substring from index 6 to 9 is: "+ substringWithStartAndEndIndex);

        //Concatenation
        String str1 = "Hello";
        String str2 = "Shreyas";
        String concatenatedString = str1.concat(str2); 
        System.out.println("Concatenated string is: "+ concatenatedString);


        //Replace
        String replacedString = str.replace('e', 'a');
        System.out.println("Replaced string is: "+ replacedString);

        //To LowerCase
        String lowerCaseString = str.toLowerCase();
        System.out.println("Lower case string is: "+ lowerCaseString);

        //To UpperCase

        String upperCaseString = str.toUpperCase();
        System.out.println("Upper case string is: "+ upperCaseString);

        //Trim
        String str3 = "   Hello Shreyas   ";
        String trimmedString = str3.trim(); 
        System.out.println("Trimmed string is: "+ trimmedString);

        //Equals
        String str4 = "Hello Shreyas";
        boolean isEqual = str.equals(str4);     
        System.out.println("Is str equals to str4: "+ isEqual);

        //EqualsIgnoreCase
        String str5 = "hello shreyas";
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str5); 
        System.out.println("Is str equals to str5 ignoring case: "+ isEqualIgnoreCase);

        //Contains
        boolean contains = str.contains("Shreyas");
        System.out.println("Does str contains Shreyas: "+ contains);    

        //StartsWith
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Does str starts with Hello: "+ startsWith);

        //EndsWith
        boolean endsWith = str.endsWith("Shreyas");
        System.out.println("Does str ends with Shreyas: "+ endsWith);

        //IndexOf
        int indexOf = str.indexOf('S');
        System.out.println("Index of S in str is: "+ indexOf);

        //LastIndexOf
        int lastIndexOf = str.lastIndexOf('e');
        System.out.println("Last index of e in str is: "+ lastIndexOf);

        //Split
        String str6 = "Hello,Shreyas";
        String[] splittedString = str6.split(",");
        System.out.println("Splitted string is: ");
        for(String s: splittedString){
            System.out.println(s);
        }

        //ToCharArray
        char[] charArray = str.toCharArray();
        System.out.println("Character array is: ");
        for(char c: charArray){
            System.out.println(c);
        }

        





    }
}