public class Castle extends Piece implements ActionInterface {

    public Castle() {
        this.pieceType  = "Castle";
    }

    @Override
    public void checkMove(Piece piece) {
        
    }
    @Override
    public void move(Piece piece, BoardTile boardTileToMove) {

    }
    @Override
    public void remove(Piece pieceToKill) {

    }

    @Override
    public String returnLocation() {
        super.returnLocation();
        output += "Piece type: " + this.pieceType;
    }
}