public class Puffenduy extends Hogvarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int conjure, int transgress, int diligence, int loyalty, int honesty) {
        super(name, conjure, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }


    @Override
    public String toString() {
        return super.toString() + " " +
                "трудолюбие=" + diligence +
                ", верность=" + loyalty +
                ", честность=" + honesty;
    }

    private int totalPoint() {
        return this.diligence + this.loyalty + this.honesty;
    }

    public boolean compare(Puffenduy puffenduy) {
        return this.totalPoint() > puffenduy.totalPoint();
    }

    public void printCompare(Puffenduy puffenduy) {
        if (this.compare(puffenduy)) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + puffenduy.getName());
        } else {
            System.out.println(puffenduy.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}

