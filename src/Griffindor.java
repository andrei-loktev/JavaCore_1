public class Griffindor extends Hogvarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {return nobility;}
    public int getHonor() {return honor;}
    public int getBravery() {return bravery;}

    @Override
    public String toString() {
        return super.toString() + " " +
                "благородство=" + nobility +
                ", честь=" + honor +
                ", храбрость=" + bravery;
    }

    private int totalPoint() {
        return this.bravery + this.honor + this.nobility;
    }

    public boolean compare(Griffindor griffindor) {
        return this.totalPoint() > griffindor.totalPoint();
    }

    public void printCompare(Griffindor griffindor) {
        if (this.compare(griffindor)) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + griffindor.getName());
        } else {
            System.out.println(griffindor.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}


