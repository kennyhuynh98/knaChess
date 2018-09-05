import java.util.ArrayList
import BoardTile
import Coordinate

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