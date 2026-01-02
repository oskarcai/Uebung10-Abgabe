package h2;

public class Feld {

    // Objektattribute/Instanzvariablen (Eigenschaften):
    private boolean boese;
    private char direction;

    // Konstruktor:
    public Feld(boolean boese, char direction) {
        this.boese = boese;
        this.direction = direction;
    }

    // Setter:
    public void setBoese(boolean boese) {
        this.boese = boese;
    }
    public void setDirection(char direction) {
        this.direction = direction;
    }

    // Getter:
    public boolean isBoese() {
        return boese;
    }
    public char getDirection() {
        return direction;
    }

}
