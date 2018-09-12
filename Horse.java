public class Horse extends Piece {

    public Horse(String pieceName, Coordinate pieceCoordinates, String team) {
        super(pieceName, pieceCoordinates, team);
    }

    //Can do like a Horse(instance).move(x, y) where x y are user specified inputs or calculate:
    // From horse.position + (move up two and right 1 or left 1) [if possible] and store all possible coordinates 
    // inside an array. 
}