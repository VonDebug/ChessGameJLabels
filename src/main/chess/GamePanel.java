package chess;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private ChessBoard board;
    private int fieldSize = 60;

    public GamePanel() {
        setLayout(null);
        board = new ChessBoard();
        for(ChessPiece p : board.getPieces()) {
            p.setBounds(p.getBoardX()*fieldSize, p.getBoardY()*fieldSize,
                    fieldSize, fieldSize);
            add(p);
        }
        for(ChessField[] row : board.getFields()) {
            for(ChessField f : row) {
                f.setBounds(f.getBoardX()*fieldSize, f.getBoardY()*fieldSize,
                        fieldSize, fieldSize);
                add(f);
            }
        }
    }
}
