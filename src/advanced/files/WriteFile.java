package advanced.files;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 4:22 PM
 **/

public class WriteFile {
    public static void main(String[] args) {

        //4 options to write file

        //FileWriter - good for small and medium-sized text advanced.files
        //BufferWriter - better performance for large amount of texts
        //PrintWriter - best for structured advanced.files (report)
        //FileOutputStream - best for binary advanced.files (images)

        String path = "E:\\Playground\\Java\\Playground\\src\\files\\";
        String message = """
                This is sample text.
                Multiple line message.
                """;

        try (FileWriter fileWriter = new FileWriter(path+"filename.txt")) {
            fileWriter.write(message);
            System.out.println("File has been written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
