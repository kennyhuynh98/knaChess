import java.util.ArrayList;

public class ChessBoard {

    private final static ArrayList<BoardTile> chessBoard = new ArrayList<BoardTile>();
    private final static String colourPreset[] = {"black" , "white"};
    private final static int BOARD_MAX = 8;

    private final static int PAWN_INDEX = 0;
    private final static int CASTLE_INDEX = 1;
    private final static int HORSE_INDEX = 2;
    private final static int BISHOP_INDEX = 3;
    private final static int QUEEN_INDEX = 4;
    private final static int KING_INDEX = 5;

    private static PieceInfo whitePieceInfo;
    private static PieceInfo blackPieceInfo;


    public ChessBoard() {
        initializeBoard();
    }
    
    public static PieceInfo getWhitePieceInfo() {
        return ChessBoard.whitePieceInfo;
    }

    public static void setWhitePieceInfo(PieceInfo pieceInfoToSet) {
        ChessBoard.whitePieceInfo = pieceInfoToSet;
    }

    public static PieceInfo getBlackPieceInfo() {
        return ChessBoard.blackPieceInfo;
    }

    public static void setBlackPieceInfo(PieceInfo pieceInfoToSet) {
        ChessBoard.blackPieceInfo = pieceInfoToSet;
    }

    // Set 8 by 8 chess board with Pieces allocated to their classical tiless.
    private static void initializeBoard() {

        Coordinate newCoordinate;
        String boardTileColour;
        BoardTile newBoardTile;

        // initialize array containing information about the amount of pieces on the chessboard for both sides to integer 0.
        setWhitePieceInfo(new PieceInfo());
        setBlackPieceInfo(new PieceInfo());

        for (int i = 0; i < BOARD_MAX; i++) {
            for (int j = 0; j < BOARD_MAX; j++) {
                newCoordinate = new Coordinate(j, i);
                boardTileColour = colourPreset[j % 2];
                if ((i % 2 == 1) && (j % 2 == 1)) {
                    boardTileColour = colourPreset[0];
                }
                else if ((i % 2 == 1) && (j % 2 == 0)) {
                    boardTileColour = colourPreset[1];
                }
                newBoardTile = new BoardTile(newCoordinate, boardTileColour, null);
                ChessBoard.chessBoard.add(newBoardTile);
            }
        }
        setPieces(whitePieceInfo, blackPieceInfo);
    }


    private static void setPieces(PieceInfo whitePieceInfo, PieceInfo blackPieceInfo) {

        String black = colourPreset[0];
        String white = colourPreset[1];

        for (BoardTile tile : chessBoard) {

            // SETTING PAWNS UP IN 0->7,1 for white and 0->7,6 for black
            if ((tile.getCoordinates().getXCoord() == 0 || (tile.getCoordinates().getXCoord() == 1) || 
            (tile.getCoordinates().getXCoord() == 2) || (tile.getCoordinates().getXCoord() == 3) || 
            (tile.getCoordinates().getXCoord() == 4) || (tile.getCoordinates().getXCoord() == 5) || 
            (tile.getCoordinates().getXCoord() == 6) || (tile.getCoordinates().getXCoord() == 7))) {
                if (tile.getCoordinates().getYCoord() == 1) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Pawn("Pawn" + (whitePieceInfo.getNumber(PAWN_INDEX) + 1), newPieceCoords, white));
                    whitePieceInfo.increment(PAWN_INDEX);
                }
                else if (tile.getCoordinates().getYCoord() == 6) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Pawn("Pawn" + (blackPieceInfo.getNumber(PAWN_INDEX) + 1), newPieceCoords, black));
                    blackPieceInfo.increment(PAWN_INDEX);
                }
            }
            

            // SETTING CASTLES UP IN 0,0 & 0,7 & 7,0 & 7,7
            if ((tile.getCoordinates().getXCoord() == 0 || tile.getCoordinates().getXCoord() == 7)) {
                if (tile.getCoordinates().getYCoord() == 0) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Castle("Castle" + (whitePieceInfo.getNumber(CASTLE_INDEX) + 1), newPieceCoords, white));
                    whitePieceInfo.increment(CASTLE_INDEX);
                }
                else if (tile.getCoordinates().getYCoord() == 7) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Castle("Castle" + (blackPieceInfo.getNumber(CASTLE_INDEX) + 1), newPieceCoords, black));
                    blackPieceInfo.increment(CASTLE_INDEX);
                }

            }

            // SETTING HORSES UP IN 1,0 & 1,7 & 6,0 & 6,7
            if ((tile.getCoordinates().getXCoord() == 1 || tile.getCoordinates().getXCoord() == 6)) {
                if (tile.getCoordinates().getYCoord() == 0) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Horse("Horse" + (whitePieceInfo.getNumber(HORSE_INDEX) + 1), newPieceCoords, white));
                    whitePieceInfo.increment(HORSE_INDEX);
                }
                else if (tile.getCoordinates().getYCoord() == 7) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Horse("Horse" + (blackPieceInfo.getNumber(HORSE_INDEX) + 1), newPieceCoords, black));
                    blackPieceInfo.increment(HORSE_INDEX);
                }

            }

            // SETTING BISHOPS UP IN 2,0 & 5,0 & 2,7 & 5,7
            if ((tile.getCoordinates().getXCoord() == 2 || tile.getCoordinates().getXCoord() == 5)) {
                if (tile.getCoordinates().getYCoord() == 0) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Bishop("Bishop" + (whitePieceInfo.getNumber(BISHOP_INDEX) + 1), newPieceCoords, white));
                    whitePieceInfo.increment(BISHOP_INDEX);
                }
                else if (tile.getCoordinates().getYCoord() == 7) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Bishop("Bishop" + (blackPieceInfo.getNumber(BISHOP_INDEX) + 1), newPieceCoords, black));
                    blackPieceInfo.increment(BISHOP_INDEX);
                }
            }

            // SETTING QUEENS UP IN 3,0 & 3,7
            if (tile.getCoordinates().getXCoord() == 3) {
                if (tile.getCoordinates().getYCoord() == 0) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Queen("Queen" + (whitePieceInfo.getNumber(QUEEN_INDEX) + 1), newPieceCoords, white));
                    whitePieceInfo.increment(QUEEN_INDEX);
                }
                else if (tile.getCoordinates().getYCoord() == 7) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new Queen("Queen" + (blackPieceInfo.getNumber(QUEEN_INDEX) + 1), newPieceCoords, black));
                    blackPieceInfo.increment(QUEEN_INDEX);
                }
            }

            // SETTING KINGS UP IN 4,0 & 4,7
            if (tile.getCoordinates().getXCoord() == 4) {
                if (tile.getCoordinates().getYCoord() == 0) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new King("King" + (whitePieceInfo.getNumber(KING_INDEX) + 1), newPieceCoords, white));
                    whitePieceInfo.increment(KING_INDEX);
                }
                else if (tile.getCoordinates().getYCoord() == 7) {
                    Coordinate newPieceCoords = new Coordinate(tile.getCoordinates().getXCoord(), tile.getCoordinates().getYCoord());
                    tile.setPiece(new King("King" + (blackPieceInfo.getNumber(KING_INDEX) + 1), newPieceCoords, black));
                    blackPieceInfo.increment(KING_INDEX);
                }
           }
        }
    }

    public static void viewTeamPieceInfo(PieceInfo whiteTeam, PieceInfo blackTeam) {
        System.out.println("==========WHITE TEAM PIECE INFO==========");
        whiteTeam.viewInfo();
        System.out.println("==========BLACK TEAM PIECE INFO==========");
        blackTeam.viewInfo();
    }

    public static boolean checkLimits(Coordinate coordinateToCheck) {
        if (coordinateToCheck.getXCoord() >= BOARD_MAX || coordinateToCheck.getYCoord() >= BOARD_MAX) {
            return false;
        }
        return true;
    }

    public void printOutput() {
        for (BoardTile currentTile : chessBoard) {
            //System.out.println("Tile(" + currentTile.getCoordinates().getXCoord() + "," + currentTile.getCoordinates().getYCoord()
            // + ") colour: " + currentTile.getColour());
             if (currentTile.getPiece() != null) {
                System.out.println("Tile piece: " + currentTile.getPiece().pieceDescription());
             }
        }
        viewTeamPieceInfo(getWhitePieceInfo(), getBlackPieceInfo());

    }
}

