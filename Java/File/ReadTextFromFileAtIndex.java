/**Write Java program to read text from file from a specified index or
skipping byte using FileInputStream. */
import java.io.*;

public class ReadTextFromFileAtIndex {
        public static void main(String[] args) {
            try (FileInputStream in = new FileInputStream( "input.txt "))
    {
                long skipBytes = 3; 
                in.skip(skipBytes);
                int data;
                while ((data = in.read()) != -1) {
    
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }