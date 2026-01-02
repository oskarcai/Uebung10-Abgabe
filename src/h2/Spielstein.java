package h2;

public class Spielstein {

    // Objektattribute/Instanzvariablen (Eigenschaften):
    private int currentRow;
    private int currentCol;
    private Spielbrett brett;

    // Konstruktor:
    public Spielstein(Spielbrett brett, int indexRow, int indexCol) {
        currentRow = indexRow;
        currentCol = indexCol;
        this.brett = brett;
    }

    // Setter:
    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }
    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }
    public void setBrett(Spielbrett brett) {
        this.brett = brett;
    }

    // Getter:
    public int getCurrentRow() {
        return currentRow;
    }
    public int getCurrentCol() {
        return currentCol;
    }
    public Spielbrett getBrett() {
        return brett;
    }

    // Methoden (Fähigkeiten):

    private boolean movesOut() {
        char direction = brett.getBrett()[currentRow][currentCol].getDirection();

        return  (direction == 'U' && currentRow == 0) ||
                (direction == 'D' && currentRow == brett.getDim() - 1) ||
                (direction == 'L' && currentCol == 0) ||
                (direction == 'R' && currentCol == brett.getDim() - 1);
    }

    public void go(int n) {
        for(int i = 0; i < n; i++) {
            Feld current_feld = brett.getBrett()[currentRow][currentCol];
            char direction = current_feld.getDirection();
            if(movesOut() || current_feld.isBoese()) {
                continue;
            }
            if(direction == 'U') {
                currentRow--;
            } else if(direction == 'D') {
                currentRow++;
            } else if(direction == 'L') {
                currentCol--;
            } else if(direction == 'R') {
                currentCol++;
            }
        }
    }

}