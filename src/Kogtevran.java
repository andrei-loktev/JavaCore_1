public class Kogtevran extends Hogvarts {
    private int smart;
    private int wise;
    private int witty;

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

    private int totalPoint() {
        return this.smart + this.wise + this.witty;
    }

    public boolean compare(Kogtevran kogtevran) {
        return this.totalPoint() > kogtevran.totalPoint();
    }

    public void printCompare(Kogtevran kogtevran) {
        if (this.compare(kogtevran)) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + kogtevran.getName());
        } else {
            System.out.println(kogtevran.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }
}

