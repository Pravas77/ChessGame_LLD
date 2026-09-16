public class Pawn extends Piece {
    public Pawn(PieceColor pieceColor, PieceType pieceType) {
        super(pieceColor,pieceType);
    }

    @Override
    public boolean validate(Board board, int stRow, int stCol, int endRow, int endCol) {

        int rowDiff = Math.abs(stRow-endRow);
        int colDiff = Math.abs(stCol-endCol);
        int delta = getPieceColor() == PieceColor.WHITE ? -1 : 1;


        if (rowDiff == 1 && colDiff == 0 && (endRow - stRow == delta))
            return board.get(endRow,endCol) == null;

        else if(rowDiff == 2 && colDiff == 0 && (endRow - stRow == 2 * delta))
            return (stRow == 1 || stRow == 6)
                    && board.get(stRow + delta,stCol) == null
                    && board.get(endRow,endCol) == null;

        else if (rowDiff == 1 && colDiff == 1 && (endRow - stRow == delta))
            return board.get(endRow,endCol) != null
                    && board.get(stRow,stCol).getPieceColor() != board.get(endRow,endCol).getPieceColor();

        else
            return false;

    }
}
