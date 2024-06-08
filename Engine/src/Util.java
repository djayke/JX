import java.io.File;
import java.io.FileNotFoundException;
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
}
