public class Fiende {
    protected String namn;
    protected int hälsa;

    Fiende(String namn, int hälsa) {
        this.hälsa = hälsa;
        this.namn = namn;
    }

    public int getHälsa() {
        return hälsa;
    }

    public String getNamn() {
        return namn;
    }

    public int setHälsa() {
        return hälsa;
    }

    public String setNamn() {
        return namn;
    }

    public void förflyttning() {
        IO.println(namn + " har flyttat på sig.");
    }

    public void attack() {
        IO.println(namn + " gör något");
    }
}
