import java.util.ArrayList;

public abstract class Move implements ActionInterface {

    private Coordinate placeToMove;

    @Override
    public abstract void act(Piece piece, BoardTile tileToMove, ChessBoard chessBoard);

    @Override
    public String moveDescription() {
        return "Piece: " + this.pieceDescription() + " moves to " + "Tile " + 
        indicatedBoardTile.getCoordinates().getXCoord() + ", " + indicatedBoardTile.getCoordinates().getYCoord() + ".";
        
    }

}