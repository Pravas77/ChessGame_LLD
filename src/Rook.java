public class Rook extends Piece {
    public Rook(PieceColor pieceColor, PieceType pieceType) {
        super(pieceColor,pieceType);
    }

    @Override
    public boolean validate(Board board, int stRow, int stCol, int endRow, int endCol) {

        int rowDiff = Math.abs(stRow-endRow);
        int colDiff = Math.abs(stCol-endCol);

        if((rowDiff == 0 || colDiff == 0) && isPathclear(board, stRow, stCol, endRow, endCol)) return true;
        else return false;


    }
}
