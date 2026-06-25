package chess.ui.componentui;

import chess.pieces.ChessPiece;
import chess.ui.GamePanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class ComponentsGamePanel extends GamePanel {

    private ArrayList<PieceLabel> labels = new ArrayList<>();

    public ComponentsGamePanel(int fieldSize) {
        super(fieldSize);

        setLayout(null);


        IntStream.range(0,8).forEach(row -> IntStream.range(0,8).forEach(col -> {

            PieceLabel label = new PieceLabel(getBoard().getField(row, col));

            label.setBounds(col * getFieldSize(), row * getFieldSize(), getFieldSize(), getFieldSize());
            add(label);
        }));

        paintPieces();

    }

    public void paintPieces(){

        IntStream.range(0,8).forEach(row ->
            IntStream.range(0,8).forEach(col -> {

                ChessPiece piece = getBoard().getPiece(row, col);
                if (piece == null) return;

                PieceLabel label = new PieceLabel(piece.getSprite());
                this.labels.add(label);

                label.setBounds(col * getFieldSize(), row * getFieldSize(), getFieldSize(), getFieldSize());
                add(label, 0);

            }));

    }



    public void updateGUI(){
        for(PieceLabel l : labels) {
        l.updateIcon();
    }
    repaint();
    }
}
