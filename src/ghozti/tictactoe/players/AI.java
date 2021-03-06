package ghozti.tictactoe.players;

import ghozti.tictactoe.io.InputOutput;
import ghozti.tictactoe.ui.Interface;

public class AI {

    private String move;

    public AI(String move){
        this.move = move;
    }

    public String getMove(){
        return move;
    }

    int[] lastMove;

    private void setLastMove(int[] in){
        lastMove = in;
    }

    private int[] getLastMove(){
        return lastMove;
    }

    public void makeMove(){
        //should make a move based on all possible outcomes with the current table status

        /*
        should check for 2 things:
        the current board status and the player's moves.
        It should try to counter the player by blocking out their moves while at the same time trying to win on it's own.
         */
    }

    private void analyzePlayer(){

    }

    private void analyzeField(){
        //checks to see if the middle slot is taken, if not it will take it.
        if(Interface.getGamePad()[2][2].equals("      ")){
            Interface.addToGamePad(getMove(),new int[]{2,2});
        }
    }
}
