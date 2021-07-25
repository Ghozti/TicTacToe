package ghozti.tictactoe.players;

import ghozti.tictactoe.ui.Interface;

public class AI {

    private String move;

    public AI(String move){
        this.move = move;
    }

    public String getMove(){
        return move;
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

    }
}
