package figures;

public abstract class figures {
    protected String name;

    public figures(String name) {
        this.name = name;
    }

    public abstract void draw();

    public void info() {
        IO.println("Jag är en figur: " + name);
    }
}
