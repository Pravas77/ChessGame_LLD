public class ChessGame {
    private Board board;
    private PieceColor expectedPieceColor;
    private GameState gameState;

    public ChessGame(Board board, PieceColor expectedPieceColor, GameState gameState) {
        this.board = board;
        this.expectedPieceColor = expectedPieceColor;
        this.gameState = gameState;
    }

    public void makeMove(int stRow, int stCol, int endRow, int endCol){

        if (gameState != GameState.ACTIVE){
            System.out.println("Game is already completed");
            return;
        }

        Piece piece = board.get(stRow,stCol);
        if(piece.getPieceColor() != expectedPieceColor) {
            System.out.println(piece.getPieceColor() + " its not your turn");
            return;
        }

        if(!piece.validate(board,stRow,stCol,endRow,endCol)){
            System.out.println(piece + " cann't move from " + stRow + "," + stCol + "  to  " + endRow + "," + endCol);
            return;
        };


        Piece killedPiece = board.get(endRow,endCol);
        board.set(stRow,stCol,null);
        board.set(endRow,endCol,piece);

        System.out.println(piece + " move from " + stRow + "," + stCol + "  to  " + endRow + "," + endCol);


        if(killedPiece != null && killedPiece.getPieceType() == PieceType.KING){
            System.out.println(expectedPieceColor + " won the game");
            gameState = expectedPieceColor == PieceColor.WHITE ? GameState.WHITE_WIN : GameState.BLACK_WIN; }

        expectedPieceColor = expectedPieceColor == PieceColor.WHITE ? PieceColor.BLACK : PieceColor.WHITE;

    }
}
