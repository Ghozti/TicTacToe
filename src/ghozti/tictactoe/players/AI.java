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
    }

    public int[] calculateOutcomes(){
        var table = Interface.getGamePad();

        return new int[] {};//should return the coordinates of the best move possible3
    }


}
