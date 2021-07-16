package ghozti.tictactoe.io;

import ghozti.tictactoe.ui.Interface;

public class IOHandler {

    public String verifyPlayerMove(int[] moves){
        if (!Interface.getGamePad()[moves[0]][moves[1]].equals(" ")){
            return;
        }
    }
}
