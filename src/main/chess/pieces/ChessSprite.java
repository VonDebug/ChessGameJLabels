package chess.pieces;

import javax.swing.*;

public class ChessSprite {

    public enum Color{BLACK, WHITE}

    int boardX;
    int boardY;
    private boolean highlighted;

    private ImageIcon normalIcon;
    private ImageIcon highlightedIcon;

    private Color color;

    public ChessSprite(String imageFile, String highlightedImageFile, int boardX, int boardY, Color color){

        this.boardX = boardX;
        this.boardY = boardY;

        this.normalIcon = new ImageIcon(imageFile);
        this.highlightedIcon = new ImageIcon(highlightedImageFile);

        this.color = color;



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

    public ImageIcon getCurrentIcon(){
        return (this.highlighted)? getHighlightedIcon():getNormalIcon();
    }

    public Color getColor() {
        return color;
    }
}

