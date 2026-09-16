public class Knight extends Piece {
    public Knight(PieceColor pieceColor, PieceType pieceType) {
        super(pieceColor,pieceType);
    }

    @Override
    public boolean validate(Board board, int stRow, int stCol, int endRow, int endCol) {

        int rowDiff = Math.abs(stRow-endRow);
        int colDiff = Math.abs(stCol-endCol);

        if( ((rowDiff == 1 && colDiff == 2) || (rowDiff == 2 && colDiff == 1))
                && (board.get(endRow,endCol) == null
                || board.get(stRow,stCol).getPieceColor() != board.get(endRow,endCol).getPieceColor()) ) return true;

        else return false;
    }
}
