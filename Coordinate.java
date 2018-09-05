class Coordinate() {

    private int xCoord;
    private int yCoord;
    private final static int BOARD_MAX = 8;

    public Coordinate(int xCoord, int yCoord) {
        setXCoord(xCoord);
        setYCoord(yCoord);
    }

    public void setXCoord(int xCoordToSet) {
        assert xCoordToSet < BOARD_MAX: "Error.";
        this.xCoord = xCoordToSet;
    }

    public int getxCoord() {
        tempXPos = this.xPos;
        return tempXPos;
    }

    public void setyCoord(int yCoordToSet) {
    assert yCoordToSet < BOARD_MAX: "Error.";
        this.yCoord = yCoordToSet;
    }

    public int getyCoord() {
        tempYPos = this.yPos;
        return tempYPos;
    }
}