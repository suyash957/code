/** Write a program to copy contents of one file to another file. */

import java.io.*;

public class FileCopy {
    public static void main(String[] args){
            try{
                FileInputStream fis = new FileInputStream("Source.txt");
                FileOutputStream fos = new FileOutputStream("Destination.txt");
                int ch;
                while((ch = fis.read()) != -1){
                    fos.write(ch);

                }
                fis.close();
                fos.close();
                System.out.println("File copied successfully");

            }catch(IOException e){
                System.out.println(e);

            }
    }
}
// public class FileCopy {
//  public static void main(String[] args) {
// try (FileInputStream in = new FileInputStream("source.txt");
// FileOutputStream out = new
// FileOutputStream("destination.txt")) {
//  byte[] buffer = new byte[1024];
//  int bytesRead;
//  while ((bytesRead = in.read(buffer)) != -1) {
//  out.write(buffer, 0, bytesRead);
//  }
//  System.out.println("File copied successfully.");
//  } catch (IOException e) {
//  e.printStackTrace();
//  }
//  }
// }