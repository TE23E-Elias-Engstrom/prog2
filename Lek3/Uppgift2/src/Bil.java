public class Bil extends Vagfordon {
    protected int antal_dörrar;

    public Bil(String reg_nr, String ägare, String färg, int vikt, int antal_dörrar) {
        super(reg_nr, ägare, färg, vikt);
        this.antal_dörrar = antal_dörrar;
    }

    @Override
    public String toString() {
        return super.toString() + "Antal dörrar: " + antal_dörrar;
    }

}
