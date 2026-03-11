public class Troll extends Fiende {
    public int styrka;

    Troll(String namn, int styrka, int hälsa) {
        super(namn, hälsa);
        this.styrka = styrka;
    }

    @Override
    public void förflyttning() {
        IO.println(namn + " har flyttat på sig.");
    }

    public void attack() {
        IO.println(namn + " slår med sin klubba");
    }
}
