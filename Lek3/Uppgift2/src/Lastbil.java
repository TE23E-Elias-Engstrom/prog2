public class Lastbil extends Vagfordon {
    protected int lastkapacitet;

    public Lastbil(String reg_nr, String ägare, String färg, int vikt, int lastkapacitet) {
        super(reg_nr, ägare, färg, vikt);
        this.lastkapacitet = lastkapacitet;

    }

    @Override
    public String toString() {
        return super.toString() + " Lastkapacitet: " + lastkapacitet;
    }
}
