package ghozti.tictactoe.players;

public class Player {

    private String move;

    private static int[] lastPlayerMove;

    public Player(String move){
        this.move = move;
    }

    public String getMove(){
        return move;
    }

    public static int[] getLastPlayerMove(){
        return lastPlayerMove;
    }

    public static void setLastPlayerMove(int[] coor){
         coor = lastPlayerMove;
    }
}
