package p2;

// Klasse  implementiert Interface -> Schnittstelle von Methoden:
public class String2 implements Editable {

    // Objektattribut:
    private String mainString;

    // Konstruktor:
    public String2(String s) {
        mainString = s;
    }

    // Methoden aus dem Interface:
    @Override
    public void addPrefix(String s) {
        mainString = s + mainString;
    }
    @Override
    public void addPostfix(String s) {
        mainString += s;
    }

    // Originale toString()-Methode überschrieben:
    @Override
    public String toString() {
        return mainString;
    }
}
