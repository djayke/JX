import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Util {

    /**
     * Read from file
     * @param filepath
     * @return string contains the content of the file
     * @throws FileNotFoundException
     */
    public static String readFromFile(String filepath) throws FileNotFoundException {
        Scanner reader = new Scanner(new File(filepath));
        StringBuilder ctx = new StringBuilder();
        while(reader.hasNext()){
            ctx.append(reader.next());
            ctx.append(" ");
        }
        return ctx.toString();
    }

    /**
     * Write to file with content
     * @param filename to be written in
     * @param content the content
     */
    public static void WriteToFile(String filename, String content) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(filename);
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String ContentIndex() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>Title</title>\n" +
                "        <script src=\"main.js\" onload=\"preprocess()\"></script>\n" +
                "        <link href=\"style.css\">\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"index\"></div>\n" +
                "        <div id=\"contact\"></div>\n" +
                "    </body>\n" +
                "    <script src=\"site.js\"></script>\n" +
                "</html>";
    }
}
