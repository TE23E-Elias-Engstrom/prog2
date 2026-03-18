public class Person {
    private String namn;
    private int fodelsear;

    public Person(String namn, int fodelsear) {
        this.namn = namn;
        this.fodelsear = fodelsear;
    }

    public String getNamn() {
        return namn;
    }

    public int getFodelsear() {
        return fodelsear;
    }

    @Override
    public String toString() {
        return (namn + " " + fodelsear).toString();
    }
}
