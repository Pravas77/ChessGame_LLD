public class Board {
    private Piece arr[][];

    public Board() {
        arr = new Piece[8][8];
        initialize();
    }

    private void initialize(){

        arr[0][0]=arr[0][7]=new Rook(PieceColor.BLACK,PieceType.ROOK);
        arr[0][1]=arr[0][6]=new Knight(PieceColor.BLACK,PieceType.KNIGHT);
        arr[0][2]=arr[0][5]=new Bishop(PieceColor.BLACK,PieceType.BISHOP);
        arr[0][3]=new Queen(PieceColor.BLACK,PieceType.QUEEN);
        arr[0][4]=new King(PieceColor.BLACK,PieceType.KING);
        for(int i=0;i<8;i++) arr[1][i] = new Pawn(PieceColor.BLACK,PieceType.PAWN);


        arr[7][0]=arr[7][7]=new Rook(PieceColor.WHITE,PieceType.ROOK);
        arr[7][1]=arr[7][6]=new Knight(PieceColor.WHITE,PieceType.KNIGHT);
        arr[7][2]=arr[7][5]=new Bishop(PieceColor.WHITE,PieceType.BISHOP);
        arr[7][3]=new Queen(PieceColor.WHITE,PieceType.QUEEN);
        arr[7][4]=new King(PieceColor.WHITE,PieceType.KING);
        for(int i=0;i<8;i++) arr[6][i] = new Pawn(PieceColor.WHITE,PieceType.PAWN);


    }

    public Piece get(int row, int col){
        return arr[row][col];
    }

    public void set(int row, int col, Piece piece){
        arr[row][col]=piece;
    }
}
