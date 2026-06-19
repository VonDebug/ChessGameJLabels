package chess.pieces;

import javax.swing.*;

public abstract class ChessSprite {

    enum Color{BLACK, WHITE}

    int boardX;
    int boardY;
    private boolean highlighted;

    private ImageIcon normalIcon;
    private ImageIcon highlightedIcon;



    public ChessSprite(String imageFile, String highlightedImageFile, int boardX, int boardY){

    }


    public int getBoardX() {
        return boardX;
    }

    public void setBoardX(int boardX) {
        this.boardX = boardX;
    }

    public int getBoardY() {
        return boardY;
    }

    public void setBoardY(int boardY) {
        this.boardY = boardY;
    }

    public boolean isHighlighted() {
        return highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    public ImageIcon getHighlightedIcon() {
        return highlightedIcon;
    }

    public ImageIcon getNormalIcon() {
        return normalIcon;
    }
}

