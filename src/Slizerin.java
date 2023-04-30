public class Slizerin extends Hogvarts{
    private final int cunning;
    private final int determined;
    private final int resourceful;

    public Slizerin(String name, int conjure, int transgress, int cunning, int determined, int resourceful) {
        super(name, conjure, transgress);
        this.cunning = cunning;
        this.determined = determined;
        this.resourceful = resourceful;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "хитрость=" + cunning +
                ", решительность=" + determined +
                ", находчивость=" + resourceful;
    }
}
