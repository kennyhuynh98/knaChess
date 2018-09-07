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
        String boardTileColour;
        for (int i = 0; i < BOARD_MAX; i++) {
            for (int j = 0; j < BOARD_MAX; j++) {
                Coordinate newCoordinate = new Coordinate(i, j);
                boardTileColour = colourPreset[j % 2];
                if ((i % 2 == 1) && (j % 2 == 1)) {
                    boardTileColour = colourPreset[0];
                }
                else if ((i % 2 == 1) && (j % 2 == 0)) {
                    boardTileColour = colourPreset[1];
                }
                BoardTile newBoardTile = new BoardTile(newCoordinate, boardTileColour);
                chessBoard.add(newBoardTile);
                System.out.println("Tile(" + i + "," + j + ") colour:" + chessBoard.get(chessBoard.size() - 1).getColour());
            }
        }
    }
}