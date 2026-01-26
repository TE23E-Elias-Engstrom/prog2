public class person {
    private final int birth_date;
    private String name;

    public person(int birth_date, String name) {
        if (birth_date < 0) {
            throw new IllegalArgumentException("Födelsedatumet måste vara > 0");
        }
    }

}
