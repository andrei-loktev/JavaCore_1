public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry",1,2, 3, 4, 5);
        Griffindor germiona = new Griffindor("Germiona", 2,3, 4, 5, 6);
        Griffindor ron = new Griffindor("Ron", 1,3, 5, 7, 6);

        Slizerin drako = new Slizerin("Drako", 2,1, 1, 3, 2);
        Slizerin grehem = new Slizerin("Grehem",1,3, 3, 2, 1);
        Slizerin gregory = new Slizerin("Gregory",4,3, 2, 5, 4);

        Puffenduy zaharia = new Puffenduy("Zaharia",3,4, 4, 2, 2);
        Puffenduy sedrik = new Puffenduy("Sedrik",5,4, 3, 3, 1);
        Puffenduy dzhastin = new Puffenduy("Dzhastin",3,2, 2, 2, 2);

        Kogtevran chzou = new Kogtevran("Chzou",6,5, 6, 2, 2);
        Kogtevran padma = new Kogtevran("Padma",5,4, 4, 1, 2);
        Kogtevran markus = new Kogtevran("Markus",7,6, 7, 8, 1);

        System.out.println(harryPotter);
        System.out.println(drako);
        System.out.println(sedrik);
        System.out.println(padma);
        harryPotter.printCompare(germiona);
        sedrik.printCompare(dzhastin);
        harryPotter.printCompare(markus);
    }
}