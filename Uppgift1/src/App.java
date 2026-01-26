public class App {
    public static void main(String[] args) throws Exception {
        Bil bil1 = new Bil("Volvo", "740", "YLX135", 2001);
        IO.println(bil1);

        bil1.ökaHastighet(100);
        IO.println("Efter att ha ökat hastigheten är nya hastigheten " + bil1.getHastighet());

        bil1.bromsa(50);
        IO.println("Efter att ha minskat hastigheten är nya hastigheten " + bil1.getHastighet());

        try {
            bil1.ökaHastighet(-10);
        } catch (IllegalArgumentException e) {
            IO.println("Fel: " + e.getMessage());
        }

        try {
            Bil bil2 = new Bil("BMW", "m5", "ABC123", 0);
        } catch (IllegalArgumentException e) {
            IO.println("Fel när bil2 skapades: " + e.getMessage());
        }
    }
}
