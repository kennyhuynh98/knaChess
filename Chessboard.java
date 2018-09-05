import java.util.ArrayList


class ChessBoard() {

    ArrayList<BoardTile> chessBoard = new ArrayList<BoardTile>();
    private String colourPreset[] = ["b" , "w"];
    private final static int BOARD_MAX = 8;

    // Set 8 by 8 chess board. 
    private static void initializeBoard() {
        String boardTileColour;
        for (int i = 0; i < BOARD_MAX, i++) {
            for (int j = 0; j < BOARD_MAX, j++) {
                boardTileColour = colourPreset[j % 2];
                BoardTile newBoardTile = new BoardTile(i, j, boardTileColour)
                chessBoard.add(newBoardTile);
            }
        }
    }
}

class BoardTile() {

    private Coordinate coordinates;
    private String colour;

    public BoardTile(Coordinate coordinates, String colour) {
        setCoordinates(coordinates);
        setColour(colour);
    }

    public void setCoordinates(Coordinate coordinatesToSet) {
        this.coordinates = coordinatesToSet;
    }

    public Coordinate getCoordinates() {
        tempCoordinates = this.coordinates;
        return tempCoordinates;
    }

    public void setColour(int colourToSet) {
        this.xPos = xPosToSet;
    }

    public String getColour() {
        tempColour = this.colour;
        return tempColour;
    }
}

class Coordinate() {

    private int xCoord;
    private int yCoord;
    private final static int BOARD_MAX = 8;

    public Coordinate(int xCoord, int yCoord) {
        setXCoord(xCoord);
        setYCoord(yCoord);
    }

    public void setXCoord(int xCoordToSet) {
        assert xCoordToSet < BOARD_MAX: "Error.";
        this.xCoord = xCoordToSet;
    }

    public int getxCoord() {
        tempXPos = this.xPos;
        return tempXPos;
    }

    public void setyCoord(int yCoordToSet) {
    assert yCoordToSet < BOARD_MAX: "Error.";
        this.yCoord = yCoordToSet;
    }

    public int getyCoord() {
        tempYPos = this.yPos;
        return tempYPos;
    }
}