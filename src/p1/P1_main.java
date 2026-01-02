package p1;

public class P1_main {
    public static void main(String[] args) {
        Betrag betrag1 = new Betrag(13,60);
        Betrag betrag2 = new Betrag(14,80);

        System.out.println("Summe von " + betrag1 + " und " + betrag2 + ": " + summe(betrag1, betrag2));
    }

    public static Betrag summe(Betrag a, Betrag b) {
        Betrag summe = new Betrag(a.getEuro() + b.getEuro(), a.getCent() + b.getCent());
        return summe;
    }
}
