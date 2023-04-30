public class Kogtevran extends Hogvarts{
    private final int smart;
    private final int wise;
    private final int witty;

    public Kogtevran(String name, int conjure, int transgress, int smart, int wise, int witty) {
        super(name, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "ум=" + smart +
                ", мудрость=" + wise +
                ", остроумие=" + witty;
    }
}

