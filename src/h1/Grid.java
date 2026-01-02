package h1;

public class Grid {

    // Objektattribut/Instanzvariable (Eigenschaft):
    private Cell[][] gridArray;

    // Konstruktor:
    public Grid(Cell[] cells, int gridRows, int gridCols) {
        gridArray = new Cell[gridRows][gridCols];

        // Alle Positionen im gridArray mit Cell-Objekten füllen (default -> boolean alive = false, weil Instanzvariable):
        for(int row = 0; row < gridRows; row++) {
            for(int col = 0; col < gridCols; col++) {
                gridArray[row][col] = new Cell(row,col);
            }
        }

        // Zellen mit richtigen Indizes auf lebendig setzen:
        for(Cell cell : cells) {
            int row = cell.getIndexRow();
            int col = cell.getIndexCol();

            // Überprüfen, ob die Indizes in das gridArray passen:
            if(row >= 0 && row < gridRows && col >= 0 && col < gridCols) {
                // Wenn ja, die Zellen im gridArray auf lebendig setzen,
                // deren Indizes mit denen aus dem Cell[] übereinstimmen:
                gridArray[row][col].setAlive(true);
            }
        }

        // Nachbarn zählen für alle Zellen:
        for(int row = 0; row < gridRows; row++) {
            for(int col = 0; col < gridCols; col++) {
                gridArray[row][col].countLivingNeighbors(gridArray);
            }
        }

    }

    // Setter:
    public void setGridArray(Cell[][] gridArray) {
        this.gridArray = gridArray;
    }

    // Getter:
    public Cell[][] getGridArray() {
        return gridArray;
    }

    // Methoden:
    public void computeNextGen() {
        // Für alle Zell-Objekte im gridArray die Methode countLivingNeighbors(gridArray) ausführen
        // -> Objektattribut isAliveNextGen (boolean) für alle Objekte setzen:
        for(Cell[] row : gridArray) {
            for(Cell cell : row) {
                cell.countLivingNeighbors(gridArray);
            }
        }
        // -> Objekattribut alive (boolean) für alle Objekte aktualisieren mit isAliveNextGen:
        for(Cell[] row : gridArray) {
            for(Cell cell : row) {
                cell.setAlive(cell.isAliveNextGen());
            }
        }
    }

    public void computeGeneration(int n) {
        for(int i = 0; i < n; i++) {
            computeNextGen();
        }
    }

}