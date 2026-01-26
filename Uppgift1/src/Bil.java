import java.time.Year;

public class Bil {
    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    private int hastighet;

    public Bil(String märke, String modell, String registreringsnummer) {
        if (märke == null || märke.isEmpty()) {
            throw new IllegalArgumentException("Märke får inte vara tomt.");
        }
        if (modell == null || modell.isEmpty()) {
            throw new IllegalArgumentException("Modell får inte vara tomt.");
        }
        if (registreringsnummer == null || registreringsnummer.isEmpty()) {
            throw new IllegalArgumentException("Registreringsnummer får inte vara tomt.");
        }
        if (årsmodell > 1860 || årsmodell <= Year.now().getValue()) {
            throw new IllegalArgumentException("årsmodellen får inte vara under 1860 eller högre än nuvarande år.");
        } else {
            IO.println("Vad gör du skriv något rätt värde!!!");
        }

        this.märke = märke;
        this.modell = modell;
        this.registreringsnummer = registreringsnummer;
        this.årsmodell = årsmodell;
        hastighet = 0;
    }

    public int getHastighet() {
        return hastighet;
    }

    public String getModell() {
        return modell;
    }

    public String getMärke() {
        return märke;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

}
