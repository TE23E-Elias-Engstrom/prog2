public class App {
    public static void main(String[] args) throws Exception {
        Bil en_volvo = new Bil();

        Bil ny_bil = new Bil("Saab", "900 Turbo", "LMJ253");

        en_volvo.märke = "Volvo";
        en_volvo.modell = "240";
        en_volvo.reg_nr = "ABC123";

        System.out.println("Bilens märke: " + en_volvo.märke);
        System.out.println("Bilens modell: " + en_volvo.modell);
        System.out.println("Bilens reg_nr: " + en_volvo.reg_nr);

        System.out.println("Bilens märke: " + ny_bil.märke);
        System.out.println("Bilens modell: " + ny_bil.modell);
        System.out.println("Bilens reg_nr: " + ny_bil.reg_nr);

    }
}
