package chess;

import javax.swing.*;

public class ChessField extends ChessSprite {
    public ChessField(String iconFile, String highlightedIconFile, int x, int y) {
        super(iconFile, highlightedIconFile, x, y);
    }

    public void setHighlighted(boolean highlighted) {
        if(highlighted) {
            setIcon(highlightedIcon);
        }
        else {
            setIcon(icon);
        }
    }
}
