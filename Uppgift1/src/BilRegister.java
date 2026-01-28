import java.util.ArrayList;

public class BilRegister {
    private ArrayList<Bil> bilar;

    public BilRegister() {
        this.bilar = new ArrayList<Bil>();

    }

    public Bil hittaBil(String registreringsnummer) {
        for (Bil bil : bilar) {
            if (bil.getRegistreringsnummer().equals(registreringsnummer)) {
                return bil;
            }
        }
        return null;
    }

    public void läggtillBil(Bil bil) {
        Bil finns = hittaBil(bil.getRegistreringsnummer());
        if (finns == null) {
            bilar.add(bil);
        } else {
            throw new IllegalArgumentException("Bilen finns redan i listan");
        }
    }

    public void taBortBil(String registreringsnummer) {
        Bil finns = hittaBil(registreringsnummer);
        if (finns == null) {
            throw new IllegalArgumentException("Bilen finns inte i listan");
        } else {
            bilar.remove(finns);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bilregister innehåller \n\n");
        for (Bil bil : bilar) {
            sb.append(bil);
            sb.append("\n----------------------\n");
        }
        return sb.toString();
    }

}
