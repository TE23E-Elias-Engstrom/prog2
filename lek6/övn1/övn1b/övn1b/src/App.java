import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        String n_text = "NAMN PÅ DELTAGARE:\n";
        try {
            Path fil_sökväg = Paths.get("personer.txt");
            Files.writeString(fil_sökväg, n_text);
            IO.println("Filen har sparats!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] names = { "Bob", "Gretchen", "Mehmet", "Howard", "Ivan", "Yiu" };
        try (FileWriter fw = new FileWriter("namn.txt")) {
            for (int i = 0; i < names.length; i++) {
                fw.write(names[i] + "\n");
            }
            fw.close();
        } catch (FileNotFoundException e) {
            IO.println("Hittar inte Filen: " + e.getMessage());
        } catch (IOException e) {
            IO.println(" Allmänt fil-fel: " + e.getMessage());
        }

    }
}
