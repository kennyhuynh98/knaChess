public class BoardTile {

    private Coordinate coordinates;
    private String colour;
    public Piece piece;

    public BoardTile(Coordinate coordinates, String colour, Piece currentPiece) {
        setCoordinates(coordinates);
        setColour(colour);
        this.piece = currentPiece;
    }

    public void setCoordinates(Coordinate coordinatesToSet) {
        this.coordinates = coordinatesToSet;
    }

    public Coordinate getCoordinates() {
        Coordinate tempCoordinates = this.coordinates;
        return tempCoordinates;
    }

    public void setColour(String colourToSet) {
        this.colour = colourToSet;
    }

    public String getColour() {
        String tempColour = this.colour;
        return tempColour;
    }
}