package chess.pieces;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ChessBoard {

    private ChessField[][] fields = new ChessField[8][8];

    private ArrayList<ChessPiece> pieces = new ArrayList<>();

    public ChessBoard(){

        IntStream.range(0,8).forEach(row ->

                IntStream.range(0,8).forEach(col ->{
                this.fields[row][col] = new ChessField(row, col, ((col + row) % 2 == 0)? ChessSprite.Color.WHITE : ChessSprite.Color.BLACK);
            }));
        setupBoard();
    }

    public ChessField getField(int x, int y){
        return this.fields[x][y];
    }

    private void setupBoard(){

        IntStream.range(0,8).forEach(row -> {

            if (row == 1 || row == 6) {

            IntStream.range(0, 8).forEach(col -> {

                    pieces.add(new Pawn(this, col, row, (row == 1) ? ChessSprite.Color.BLACK : ChessSprite.Color.WHITE));
                });
            }
            });
        }


    public void highlight(int x, int y){
        fields[x][y].setHighlighted(true);
    }

    public void unhighlight(int x, int y){
        fields[x][y].setHighlighted(false);
    }

    public ChessPiece getPiece(int row, int col){

        for(ChessPiece chessPiece : this.pieces){
            if(chessPiece.getSprite().getBoardX() == col && chessPiece.getSprite().getBoardY() == row){
                return chessPiece;
            }
        }

        return null;
    }



}

