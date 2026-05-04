import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Vara> lager = new ArrayList<>();

        lager.add(new Vara("Kaffe", 25, 5));
        lager.add(new Vara("Bulle", 20, 5));
        lager.add(new Vara("Läsk", 15, 3));
        lager.add(new Vara("Glass", 10, 3));
        lager.add(new Vara("Godispåsar", 10, 3));

        while (true) {
            Vara vald = väljVara(lager);

            if (vald.getAntal() >= 1) {
                vald.sälj();
                IO.println("Såld. Vinst: " + vald.getPris() * 0.5);
                IO.println("Nytt saldo för " + vald.getNamn() + ": " + vald.getAntal());
            } else if (vald.getAntal() < 1) {
                IO.println("Varan är slut i lagret, ska vi köpa in? y/n");
                if (IO.readln().matches("y")) {
                    String antalString = IO.readln("Ange hur många? (1-5)");
                    int antal = 0;
                    try {
                        antal = Integer.parseInt(antalString);
                    } catch (Exception e) {
                        IO.println(e);
                    }
                    if (antal != 0) {
                        vald.köp_in(antal);
                    }
                }
            }
        }n,

    }

    static Vara väljVara(List<Vara> lager) {
        while (true) {
            String varonamn = IO.readln("\n Ange såld vara (tom för avslut): ");
            if (varonamn.isBlank()) {
                IO.println("Avslutar programmet.");
                System.exit(0);
            }
            for (Vara vara : lager) {
                if (vara.getNamn().matches(varonamn)) {
                    return vara;
                }
            }
        }
    }
}
