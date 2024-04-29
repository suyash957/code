/**Write a program to write bytes to a file. */

import java.io.*;

public class WriteBytesToFile {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("data.bin");
            byte[] data = {10,20,40,50,60,70,80,90};
            fos.write(data);
            fos.close();
            System.out.println("Data written to file successfully");
            
        }catch( IOException e){
            System.out.println(e);

        }

    }
}
