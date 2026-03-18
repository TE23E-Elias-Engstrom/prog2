import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> register = new ArrayList<>();

        register.add(new Person("Anna", 1990));
        register.add(new Person("Berit", 1995));
        register.add(new Person("Carl", 2005));
        register.add(new Person("David", 1982));

        while (true) {
            String val = meny();
            switch (val) {
                case "1":
                    String namn = IO.readln("\n\n\nVilket namn: ");
                    int fodelsedatum = Integer.parseInt(IO.readln("Ange födelseålder: "));
                    register.add(new Person(namn, fodelsedatum));
                    break;

                case "2":
                    namn = IO.readln("\nVilket namn: ");
                    boolean hittat = false;
                    for (Person person : register) {
                        if (person.getNamn().matches(namn)) {
                            IO.println("\nResultat: " + person.toString() + "\n");
                            hittat = true;
                        }
                    }
                    if (!hittat) {
                        IO.println("Ingen person hittas med det namnet.");
                    }
                    break;
                case "3":
                    IO.println("\n\n\nTa bort ett namn ur listan");
                    namn = IO.readln("Ange ett namn: ");
                    if (register.removeIf(person -> person.getNamn().equalsIgnoreCase(namn))) {
                        IO.println(namn + " borttagen!");
                    } else {
                        IO.println("Ingen person hittad");
                    }
                case "4":
                    System.exit(0);
                    break;
            }
        }

    }

    static String meny() {
        while (true) {
            IO.println("""
                    1. Lägg till
                    2. Sök
                    3. Ta bort
                    4. Avslut
                    """);
            String val = IO.readln("Välj ett av alternativen: ");
            if (List.of("1", "2", "3", "4").contains(val)) {
                return val;
            } else {
                IO.println("Fel inmatning, vg försök igen");
            }
        }

    }
}
