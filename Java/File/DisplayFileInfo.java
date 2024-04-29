

import java.io.File;

public class DisplayFileInfo {
    public static void main(String[] args) {
        File file = new File("InfoFile.txt");
        if (file.exists()) {
                System.out.println("File name: " + file.getName());
                System.out.println("File path: " + file.getAbsolutePath());
                System.out.println("File size: " + file.length() + " bytes");
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Executable: " + file.canExecute());
        } else {
                System.out.println("File does not exist.");
        }
    }
}
