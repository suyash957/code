/**Write Java program to append text/string in a file. */

import java.io.*;
public class AppendToFile {
      public static void main(String[] args) {
            try (FileWriter writer = new FileWriter("Appended.txt", true))
{
                  writer.write("Java Lab Completed\n");
                  System.out.println("Text appended to the file.");
            } catch (IOException e) {
                  e.printStackTrace();
            }
      }
}