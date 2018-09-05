import Coordinate

class BoardTile() {

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
        tempCoordinates = this.coordinates;
        return tempCoordinates;
    }

    public void setColour(int colourToSet) {
        this.xPos = xPosToSet;
    }

    public String getColour() {
        tempColour = this.colour;
        return tempColour;
    }
}