public class Slizerin extends Hogvarts{
    private int cunning;
    private int determined;
    private int resourceful;

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
    private int totalPoint() {
        return this.cunning + this.determined + this.resourceful;
    }

    public boolean compare(Slizerin slizerin) {
        return this.totalPoint() > slizerin.totalPoint();
    }

    public void printCompare(Slizerin slizerin) {
        if (this.compare(slizerin)) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + slizerin.getName());
        } else {
            System.out.println(slizerin.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }
}
