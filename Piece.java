import java.util.ArrayList;

public abstract class Piece {

    // public ArrayList<Action> actionList = new ArrayList<action>();
    // Use enumerator for piece type and movemeent?
    public String pieceName = "";
    public Coordinate coordinates;
    public String team = "";

    public Piece(String pieceName, Coordinate pieceCoordinates, String team) {
        this.pieceName = pieceName;
        setPieceCoordinates(pieceCoordinates);
        this.team = team;
    }

    public void setPieceCoordinates(Coordinate coordinatesToSet) {
        this.coordinates = coordinatesToSet;
    }

    public Coordinate getPieceCoordinates() {
        Coordinate tempCoords = this.coordinates;
        return tempCoords;
    }

    public String pieceDescription() {
        String output = this.pieceName + "(" + getPieceCoordinates().getXCoord() + "," + 
        getPieceCoordinates().getYCoord() + ") " + " Team: " + this.team;
        return output;
    }
}
