package chess.pieces;

public class ChessField extends ChessSprite{
    private String highlightedImageFile = "./ressources/Chess_fat60.png";
    private String imageFile;

    public ChessField(int x, int y, Color color) {
        super(imageFile = (color == Color.WHITE)? "./resources/Chess_flt60.png":"./resources/Chess_fdt60.png","./ressources/Chess_fat60.png", x, y, color);


    }
}
