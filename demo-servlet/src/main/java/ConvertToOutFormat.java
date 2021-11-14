import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// this class converts the content of a file to
// be able to print to a webpage by surrounding the text with
// out.print("<content>");
public class ConvertToOutFormat {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/webapp/calculatorResponse.html");
        Scanner scanner = new Scanner(file);

        // read from file:
        while(scanner.hasNext()) {
            String line = scanner.nextLine().trim();
            // print out if non-empty:
            if(line.length() > 0){
                System.out.println("out.print(\"" + line + "\");");
            }
        }

    }
}
