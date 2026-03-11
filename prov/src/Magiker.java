public class Magiker extends Fiende {
    public int mana;

    Magiker(String namn, int mana, int hälsa) {
        super(namn, hälsa);
        this.mana = mana;
    }

    @Override
    public void förflyttning() {
        IO.println(namn + " har flyttat på sig.");
    }

    public void attack() {
        IO.println(namn + " skjuter mana-blixtrar med sin stav");
    }
}
