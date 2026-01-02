package h2;

public class Spielbrett {

    // Objektattribute/Instanzvariablen (Eigenschaften):
    private Feld[][] brett;
    private int dim;

    // Konstruktor:
    public Spielbrett(int dim) {
        this.dim = dim;
        brett = new Feld[dim][dim];
    }

    // Setter:
    public void setBrett(Feld[][] brett) {
        this.brett = brett;
    }
    public void setDim(int dim) {
        this.dim = dim;
    }

    // Getter:
    public Feld[][] getBrett() {
        return brett;
    }
    public int getDim() {
        return dim;
    }

}
