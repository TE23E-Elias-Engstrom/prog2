public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Bil bil1 = new Bil("Volvo", "740", "YLX135", 2001);
         * IO.println(bil1);
         * 
         * bil1.ökaHastighet(100);
         * IO.println("Efter att ha ökat hastigheten är nya hastigheten " +
         * bil1.getHastighet());
         * 
         * bil1.bromsa(50);
         * IO.println("Efter att ha minskat hastigheten är nya hastigheten " +
         * bil1.getHastighet());
         * 
         * try {
         * bil1.ökaHastighet(-10);
         * } catch (IllegalArgumentException e) {
         * IO.println("Fel: " + e.getMessage());
         * }
         * 
         * try {
         * Bil bil2 = new Bil("BMW", "m5", "ABC123", 2016);
         * } catch (IllegalArgumentException e) {
         * IO.println("Fel när bil2 skapades: " + e.getMessage());
         * }
         * }
         */

        BilRegister register = new BilRegister();

        // Lägg till bilar
        register.läggtillBil(new Bil("Volvo", "740", "ABC123", 2020));
        register.läggtillBil(new Bil("Mazda", "3", "DFG456", 2010));
        register.läggtillBil(new Bil("Tesla", "Model 3", "HIJ789", 2024));

        // Ta bort bil
        register.taBortBil("ABC123");
        IO.println("\nEfter att ha tagit bort bilen.");
        IO.println(register.toString());

        // Testa att hitta en bil
        Bil bil = register.hittaBil("HIJ789");
        IO.println("\nHittad bil" + bil);
    }
}
