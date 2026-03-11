public class Djur {
    protected double vikt;
    protected int energi;
    protected boolean lever;

    protected static int antaldjur;

    public Djur(double vikt, int energi, boolean lever) {
        this.vikt = vikt;
        this.energi = energi;
        this.lever = lever;
        antaldjur++;
    }

    public void äta(int energi) {
        energi = this.energi + energi;
    }

    public void spring(int meter) {
        energi = energi - (meter * ((int) Math.round(vikt)));
        if (energi <= 0) {
            lever = false;
        }
    }

}
