public class Hogvarts {

    private final String name;
    private final int conjure;
    private final int transgress;

    public Hogvarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return "имя='" + name + '\'' +
                ", колдовство=" + conjure +
                ", трансгрессия=" + transgress + ", ";
    }

    private int totalPoint() {
        return this.conjure + this.transgress;
    }

    public boolean compare(Hogvarts hogvarts) {
        return this.totalPoint() > hogvarts.totalPoint();
    }

    public void printCompare(Hogvarts hogvarts) {
        if (this.compare(hogvarts)) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + hogvarts.getName());
        } else {
            System.out.println(hogvarts.getName() + " обладает большей мощностью магии, чем " + this.getName());
        }
    }
}
