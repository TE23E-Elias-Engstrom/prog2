import java.time.Year;

public class Bil {
    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    private int hastighet;

    public Bil(String märke, String modell, String registreringsnummer, int årsmodell) {
        if (märke == null || märke.isEmpty()) {
            throw new IllegalArgumentException("Märke får inte vara tomt.");
        } else if (modell == null || modell.isEmpty()) {
            throw new IllegalArgumentException("Modell får inte vara tomt.");
        } else if (registreringsnummer == null || registreringsnummer.isEmpty()) {
            throw new IllegalArgumentException("Registreringsnummer får inte vara tomt.");
        } else if (årsmodell <= 1860 || årsmodell >= 2026) {
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
        if (hastighet <= 0 || hastighet >= 500) {
            throw new IllegalArgumentException("Ange ett giltigt värde på hastighet");
        }
    }

    public void setModell(String modell) {
        if (modell == null || modell.isEmpty()) {
            throw new IllegalArgumentException("Modell får inte vara tomt.");
        }
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public void ökaHastighet(int ökning) {
        if (ökning <= 0) {
            throw new IllegalArgumentException("Ökningen kan inte vara mindre än 0");
        } else {
            hastighet += ökning;
        }
    }

    public void bromsa(int minskning) {
        if (minskning >= 0 || minskning < hastighet) {
            hastighet -= minskning;
        } else {
            throw new IllegalArgumentException(
                    "Ange ett postitiv giltig bromsning som är mindre än hastigheten: " + hastighet);
        }
    }

    public String toString() {
        return "Märke: " + märke + " Modell: " + modell + " Reg_nr: " + registreringsnummer + " Årmodell: " + årsmodell;
    }
}
