public class Hogvarts {

    private final String name;
    private final int conjure;
    private final int transgress;

    public Hogvarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {return name;}

    public int getConjure() {return conjure;}

    public int getTransgress() {return transgress;}

    @Override
    public String toString() {
        return "имя='" + name + '\'' +
                ", колдовство=" + conjure +
                ", трансгрессия=" + transgress;
    }
}
