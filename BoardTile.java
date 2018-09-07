public class BoardTile {

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