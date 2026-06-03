package chess;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class ChessPiece extends ChessSprite implements MouseListener {
    public enum Color {WHITE, BLACK};
    private Color color;
    private ChessBoard board;

    public ChessPiece(ChessBoard board, String imagefile, String mouseOverImageFile, int x, int y, Color color) {
        super(imagefile, mouseOverImageFile, x, y);
        this.color = color;
        this.board = board;
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(highlightedIcon);
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(canMoveTo(i, j)) {
                    board.highlight(i, j);
                }
            }
        }
        invalidate();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(icon);
        board.unhighlightAll();
        invalidate();
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean canMoveTo(int x, int y);
}
