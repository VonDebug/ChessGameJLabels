package chess.ui.componentui;

import chess.pieces.ChessSprite;

import javax.swing.*;

public class PieceLabel extends JLabel {

    private ChessSprite sprite;

    public PieceLabel(ChessSprite sprite){
    this.sprite = sprite;
    updateIcon();

}

    public void updateIcon(){

        setIcon((this.sprite.getCurrentIcon()));

    }

    public ChessSprite getSprite() {
        return this.sprite;
    }
}
