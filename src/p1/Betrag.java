package p1;

public class Betrag {
    // Objektattribute/Instanzvariablen (Eigenschaften):
    private int euro;
    private int cent;

    // Konstruktor:
    public Betrag(int euro, int cent) {
        setEuro(euro);
        setCent(cent);
    }

    // Setter:
    public void setEuro(int euro) {
        this.euro = euro;
    }
    public void setCent(int cent) {
        if(cent >= 100) {
            euro += cent / 100;
            this.cent = cent % 100;
        } else {
            this.cent = cent;
        }
    }

    // Getter:
    public int getEuro() {
        return euro;
    }
    public int getCent() {
        return cent;
    }

    @Override
    public String toString() {
        return euro + "," + cent + "€";
    }

}
