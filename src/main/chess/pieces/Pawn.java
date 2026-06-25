package chess.pieces;

public class Pawn implements ChessPiece {

    private ChessBoard board;
    private ChessSprite sprite;

    public Pawn(ChessBoard board, int x, int y, ChessSprite.Color color) {
        this.board = board;
        String image = (color == ChessSprite.Color.WHITE) ? "./resources/Chess_plt60.png" : "./resources/Chess_pdt60.png";
        this.sprite = new ChessSprite(image, "./resources/Chess_pat60.png", x, y, color);
    }

    @Override
    public boolean canMoveTo(int x, int y) {

        if (y == 1 || y == 2) {

            if (sprite.getColor() == ChessSprite.Color.BLACK) {
                return sprite.getBoardY() < y;
            } else {
                return sprite.getBoardY() > y;
            }
        }
        return false;
    }

    @Override
    public ChessSprite getSprite() {
        return sprite;
    }

    public ChessBoard getBoard() {
        return board;
    }
}
