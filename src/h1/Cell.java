package h1;

public class Cell {

    // Objektattribute/Instanzvariablen (Eigenschaften):
    private int indexRow;
    private int indexCol;
    private boolean alive;
    private int numLivingNeighbors;
    private boolean isAliveNextGen;

    // Konstruktor:
    public Cell(int indexRow, int indexCol, boolean alive) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
        this.alive = alive;
    }
    public Cell(int indexRow, int indexCol) {
        this.indexRow = indexRow;
        this.indexCol = indexCol;
    }

    // Setter:
    public void setIndexRow(int indexRow) {
        this.indexRow = indexRow;
    }
    public void setIndexCol(int indexCol) {
        this.indexCol = indexCol;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public void setNumLivingNeighbors(int numLivingNeighbors) {
        this.numLivingNeighbors = numLivingNeighbors;
    }
    public void setIsAliveNextGen(boolean isAliveNextGen) {
        this.isAliveNextGen = isAliveNextGen;
    }

    // Getter:
    public int getIndexRow() {
        return indexRow;
    }
    public int getIndexCol() {
        return indexCol;
    }
    public boolean isAlive() {
        return alive;
    }
    public int getNumLivingNeighbors() {
        return numLivingNeighbors;
    }
    public boolean isAliveNextGen() {
        return isAliveNextGen;
    }

    // Methoden (Fähigkeiten):
    public void countLivingNeighbors(Cell[][] gridArray) {
        int counter = 0;    // Zähler für Anzahl der lebendigen Nachbarn

        // Schleife durch alle möglichen Nachbarspositionen relativ zum Zell-Objekt:
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                // Überspringe die Objekt-Zelle selbst
                if(i == 0 && j == 0) {
                    continue;
                }
                // Überprüfen, ob die Nachbars-Index-Position im gridArray existiert:
                if(indexRow + i >= 0 && indexRow + i < gridArray.length
                && indexCol + j >= 0 && indexCol + j < gridArray[0].length) {
                    // Überprüfen, ob die benachbarte Zelle lebendig ist:
                    if(gridArray[indexRow + i][indexCol + j].isAlive()) {
                        counter++;
                    }
                }
            }
        }

        // counter dem Objektattribut numLivingNeighbors zuweisen -> Setter:
        numLivingNeighbors = counter;

        // Methode decideNextStatus aufrufen, um das Objektattribut isAliveNextGen (boolean) zu setzen:
        decideNextStatus();
    }

    private void decideNextStatus() {
        if(alive) {
            isAliveNextGen = numLivingNeighbors == 2 || numLivingNeighbors == 3;
        } else {
            isAliveNextGen = numLivingNeighbors == 3;
        }
    }

}
