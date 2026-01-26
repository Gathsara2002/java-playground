package advanced.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 4:31 PM
 **/

public class ReadFile {
    public static void main(String[] args) {

        //3 options

        //BufferReader + FilerReader - best for reading text line by line
        //FileInputStream - best for binary advanced.files
        //RandomAccessFiles - best for read/write portion for file

        String path = "E:\\Playground\\Java\\Playground\\src\\files\\filename.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
