public class App {
    public static void main(String[] args) throws Exception {
        BankKonto konto = new BankKonto("8284-2944", "Elias", 100);
        IO.println(konto);

        try {
            konto.sätt_in(500);
            IO.println("Efter insättning: " + konto.get_saldo());
        } catch (IllegalArgumentException e) {
            IO.println("Fel: " + e.getMessage());
        }

        try {
            konto.ta_ut(300);
            IO.println("Efter uttag: " + konto.get_saldo());
        } catch (IllegalArgumentException e) {
            IO.println("Fel: " + e.getMessage());
        }
        IO.println("Antal konton: " + BankKonto.antal_konton_skapat());
    }
}
