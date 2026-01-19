package files;

import java.io.File;
import java.io.IOException;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 4:17 PM
 **/

public class CreateFile {
    public static void main(String[] args) {
        try {
            String path = "E:\\Playground\\Java\\Playground\\src\\files\\";
            File myObj = new File(path + "filename.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
