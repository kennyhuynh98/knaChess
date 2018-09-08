import java.util.ArrayList;

public class ChessBoard {

    private final static ArrayList<BoardTile> chessBoard = new ArrayList<BoardTile>();
    private final static String colourPreset[] = {"b" , "w"};
    private final static int BOARD_MAX = 8;

    public ChessBoard() {
        initializeBoard();
    }
    
    // Set 8 by 8 chess board.
    private static void initializeBoard() {

        Coordinate newCoordinate;
        String boardTileColour;
        BoardTile newBoardTile;

        for (int i = 0; i < BOARD_MAX; i++) {
            for (int j = 0; j < BOARD_MAX; j++) {
                newCoordinate = new Coordinate(i, j);
                boardTileColour = colourPreset[j % 2];
                if ((i % 2 == 1) && (j % 2 == 1)) {
                    boardTileColour = colourPreset[0];
                }
                else if ((i % 2 == 1) && (j % 2 == 0)) {
                    boardTileColour = colourPreset[1];
                }
                newBoardTile = new BoardTile(newCoordinate, boardTileColour, null);
                chessBoard.add(newBoardTile);
            }
        }
        setPieces();

    }
    public static void setPieces() {
        chessBoard.forEach((BoardTile)->System.out.println("Tile(" + BoardTile.getCoordinates().getXCoord() + "," + 
        BoardTile.getCoordinates().getYCoord() + ")"));
    }

    public static bool checkLimits(Coordinate coordinateToCheck) {
        if (coordinateToCheck.getXCoord() >= BOARD_MAX || coordinateToCheck.getYCoord() >= BOARD_MAX) {
            return false;
        }
        return true;
    }

    public void printOutput() {
        for (BoardTile currentTile : chessBoard) {
            System.out.println("Tile(" + currentTile.getCoordinates().getXCoord() + "," + currentTile.getCoordinates().getYCoord()
             + ") colour: " + currentTile.getColour() + " Tile piece: " + currentTile.piece);
        }
    }
}

