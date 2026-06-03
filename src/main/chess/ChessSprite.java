package chess;

import javax.swing.*;

public abstract class ChessSprite extends JLabel {
    protected int boardX;
    protected int boardY;
    protected ImageIcon icon;
    protected ImageIcon highlightedIcon;

    public ChessSprite(String imagefile, String highlightedImageFile, int x, int y) {
        icon = new ImageIcon(imagefile);
        highlightedIcon = new ImageIcon(highlightedImageFile);
        setIcon(icon);
        this.boardX = x;
        this.boardY = y;
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
}
