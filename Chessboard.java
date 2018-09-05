import java.util.ArrayList

class ChessBoard() {

    private final static int BOARD_MAX = 8;
    ArrayList<BoardTile> chessBoard = new ArrayList<BoardTile>();
    private String colourPreset[] = ["b" , "w"];

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

    private int xPos;
    private int ypos;
    private String colour;

    public BoardTile(int xPos, int yPos, String colour) {
        setxPos(xPos);
        setyPos(yPos);
        setColour(colour);
    }

    public void setxPos(int xPosToSet) {
        this.xPos = xPosToSet;
    }

    public int getxPos() {
        tempxPos = this.xPos;
        return tempxPos;
    }

    public void setyPos(int yPosToSet) {
        this.yPos = yPosToSet;
    }

    public int getyPos() {
        tempyPos = this.yPos;
        return tempyPos;
    }

    public void setColour(int colourToSet) {
        this.xPos = xPosToSet;
    }

    public String getColour() {
        tempColour = this.colour;
        return tempColour;
    }
}