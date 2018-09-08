public interface ActionInterface {
    public void checkMove(Piece piece);
    public void move(Piece piece, BoardTile tileToMove);
    public void remove(Piece pieceToRemove);
}