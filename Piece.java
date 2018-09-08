import java.util.ArrayList;

public abstract class Piece {

    // public ArrayList<Action> actionList = new ArrayList<action>();
    // Use enumerator for piece type and movemeent?
    public String pieceType = "";
    public BoardTile currentBoardTile;
    public String returnLocation() {
        String output = "Current location: (" + currentBoardTile.getCoordinates().getXCoord() + "," + currentBoardTile.getCoordinates()
        .getYCoord() + ")" + pieceType;
        return output;
    } 
}
