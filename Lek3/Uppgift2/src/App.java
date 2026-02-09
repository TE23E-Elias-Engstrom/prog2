import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Vagfordon> fordonslista = new ArrayList<>();

        IO.println("""
                1. Skapa Bil
                2. Skapa Lastbil
                3. Lista skapade Vägfordon
                4. Avsluta progammet
                """);
        String valString = IO.readln();

        while (true) {
            switch (valString) {
                case "1":
                    skapaBil(fordonslista);
                    break;
                case "2":
                    skapaLastbil(fordonslista);
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    throw new IllegalArgumentException("Måste ange ett svar 1-4");
            }
        }
    }

    static void skapaBil(ArrayList<Vagfordon> fordonslista) {
        IO.println("Ange reg_nr (ex: ABC 123): ");
        String reg_nr = IO.readln();
        IO.println("Ange ägare: ");
        String ägare = IO.readln();
        IO.println("Ange färg: ");
        String färg = IO.readln();
        IO.println("Ange vikt: ");
        int vikt = Integer.parseInt(IO.readln());
        IO.println("Ange antal dörrar: ");
        int antal_dörrar = Integer.parseInt(IO.readln());
        Bil bil = new Bil(reg_nr, ägare, färg, vikt, antal_dörrar);

        fordonslista.add(bil);
    }

    static void skapaLastbil(ArrayList<Vagfordon> fordonslista) {
        IO.println("Ange reg_nr (ex: ABC 123): ");
        String reg_nr = IO.readln();
        IO.println("Ange ägare: ");
        String ägare = IO.readln();
        IO.println("Ange färg: ");
        String färg = IO.readln();
        IO.println("Ange vikt: ");
        int vikt = Integer.parseInt(IO.readln());
        IO.println("Ange antal dörrar: ");
        int lastkapacitet = Integer.parseInt(IO.readln());
        Lastbil Lastbil = new Lastbil(reg_nr, ägare, färg, vikt, lastkapacitet);

        fordonslista.add(Lastbil);
    }

    static void listaVagfordon(ArrayList<Vagfordon> fordonslista) {
        IO.println("Lista med alla vägfordon");
        IO.println(fordonslista.toString());
    }

}
