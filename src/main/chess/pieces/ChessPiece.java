package chess.pieces;

public interface ChessPiece {

    boolean canMoveTo(int x, int y);

    ChessSprite getSprite();
}
