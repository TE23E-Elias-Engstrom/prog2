import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> deltagare_ej_rensad;
        try {
            Path fil_sökväg = Paths.get("deltagare.txt");
            deltagare_ej_rensad = Files.readAllLines(fil_sökväg);
            deltagare_ej_rensad.remove("NAMN på deltagare: ");
            HashSet<String> deltagare_rensad = new HashSet<>(deltagare_ej_rensad);
            List<String> rensad_lista = new ArrayList<>(deltagare_rensad);
            Collections.sort(rensad_lista);
            try {
                Path filsökväg = Paths.get("soft_rens_deltagare.txt");
                Files.write(filsökväg, rensad_lista);
                IO.println("Filen inläst: " + deltagare_ej_rensad);
            } catch (IOException e) {
                IO.println("Fel vid skrivning till fil: " + e.getMessage());
                e.printStackTrace();
            }

        } catch (IOException e) {
            IO.println("Fel vid filinläsning: " + e.getMessage());
            return;
        }
    }
}
