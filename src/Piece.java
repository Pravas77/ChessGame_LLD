public abstract class Piece {
    private PieceColor pieceColor;
    private PieceType pieceType;

    public Piece(PieceColor pieceColor, PieceType pieceType) {
        this.pieceColor = pieceColor;
        this.pieceType = pieceType;
    }

    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    @Override
    public String toString() {
        return pieceColor + " " + pieceType;
    }

    public abstract boolean validate(Board board, int stRow, int stCol, int endRow, int endCol);

    public boolean isPathclear(Board board, int stRow, int stCol, int endRow, int endCol){

        int rowDelta = Integer.compare(endRow,stRow);
        int colDelta = Integer.compare(endCol,stCol);
        PieceColor playerColor = board.get(stRow,stCol).getPieceColor();

        stRow+=rowDelta;
        stCol+=colDelta;
        while (stRow != endRow || stCol != endCol){
            if (board.get(stRow,stCol) != null) return  false;

            stRow+=rowDelta;
            stCol+=colDelta;
        }

        if(board.get(endRow,endCol) != null && board.get(endRow,endCol).getPieceColor() == playerColor) return  false;
        return true;
    }


}
