public class BankKonto {
    private final String kontonummer;
    private String ägare;
    private double saldo;
    private static double antal_konton = 0;

    public BankKonto(String kontonummer, String ägare, double startSaldo) {
        if (kontonummer == null || kontonummer.isEmpty()) {
            throw new IllegalArgumentException("Kontonummer får inte vara tomt.");
        }
        if (ägare == null || ägare.trim().isEmpty()) {
            throw new IllegalArgumentException("Ägare får inte vara tomt.");
        }
        if (startSaldo < 0) {
            throw new IllegalArgumentException("Startsaldo får inte vara under noll.");
        }
        this.kontonummer = kontonummer;
        this.ägare = ägare;
        this.saldo = startSaldo;
        BankKonto.antal_konton++;
    }

    public String get_kontonumme() {
        return kontonummer;
    }

    public String get_ägare() {
        return ägare;
    }

    public double get_saldo() {
        return saldo;
    }

    public void ta_ut(double belopp) {
        if (belopp <= 0) {
            throw new IllegalArgumentException("Belopp måste vara över 0.");
        }
        if (belopp > saldo) {
            throw new IllegalArgumentException("Uttag måste vara större än saldo");
        }
        saldo -= belopp;
    }

    public void sätt_in(double belopp) {
        if (belopp <= 0) {
            throw new IllegalArgumentException("Belopp måste vara över 0.");
        }
        saldo += belopp;
    }

    public void överför(BankKonto mottagare, double belopp) {
        if (mottagare == null) {
            throw new IllegalArgumentException("Mottagare får ej vara null.");
        }
        if (belopp < 0) {
            throw new IllegalArgumentException("Belopp måste vara över 0.");
        }

        this.ta_ut(belopp);
        mottagare.sätt_in(belopp);

    }

    @Override
    public String toString() {
        return "Bankkonto: kontonummer= " + kontonummer + ", ägare= " + ägare + ", saldo= " + saldo;
    }

    public static double antal_konton_skapat() {
        return BankKonto.antal_konton;
    }
}
