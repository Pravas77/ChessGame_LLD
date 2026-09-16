//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        ChessGame chessGame = new ChessGame(new Board(),PieceColor.WHITE,GameState.ACTIVE);

//        chessGame.makeMove(1,2,3,2);
        chessGame.makeMove(6,0,4,0);
        chessGame.makeMove(1,3,3,3);
        chessGame.makeMove(7,0,6,0);
//        chessGame.makeMove(6,0,5,0);
        chessGame.makeMove(0,3,2,3);


    }
}