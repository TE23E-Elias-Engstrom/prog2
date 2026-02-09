public class Vagfordon {
    protected String reg_nr;
    protected String ägare;
    protected String färg;
    protected int vikt;

    public Vagfordon(String reg_nr, String ägare, String färg, int vikt) {
        this.reg_nr = reg_nr;
        this.ägare = ägare;
        this.färg = färg;
        this.vikt = vikt;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public String getReg_nr() {
        return reg_nr;
    }

    public void setReg_nr(String reg_nr) {
        if (reg_nr.matches("[A-Za-z]{3}+[0-9]{3+}")) {
            this.reg_nr = reg_nr;
        } else {
            throw new IllegalArgumentException("Regnummret måste följa ABC 123");
        }
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public String getÄgare() {
        return ägare;
    }

    public void setÄgare(String ägare) {
        this.ägare = ägare;
    }

    @Override
    public String toString() {
        return ("Reg_nr: " + reg_nr + " Ägare: " + ägare + " Färg: " + färg + " Vikt: " + vikt);
    }

}
