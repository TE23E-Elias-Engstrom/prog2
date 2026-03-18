import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Person> personLista = new ArrayList<>();

        personLista.add(new Person("Alice", 2000));
        personLista.add(new Person("Bob", 2004));
        personLista.add(new Person("Charlie", 2007));

        IO.println("Lista efter tillägg " + personLista);

        for (Person p : personLista) {
            if (p.getNamn().equals(personLista)) {
                p.setNamn("Bobby");
                break;
            }
        }

        IO.println("Efter ändring " + personLista);
    }
}
