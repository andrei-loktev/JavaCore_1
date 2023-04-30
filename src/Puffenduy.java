public class Puffenduy extends Hogvarts{
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Puffenduy(String name, int conjure, int transgress, int diligence, int loyalty, int honesty) {
        super(name, conjure, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {return diligence;}

    public int getLoyalty() {return loyalty;}

    public int getHonesty() {return honesty;}



    @Override
    public String toString() {
        return super.toString() + " " +
                "трудолюбие=" + diligence +
                ", верность=" + loyalty +
                ", честность=" + honesty;
    }
}

