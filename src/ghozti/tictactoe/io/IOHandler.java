package ghozti.tictactoe.io;

import ghozti.tictactoe.constants.Constants;
import ghozti.tictactoe.ui.Interface;

public class IOHandler {

    public String verifyPlayerMove(int[] moves){
        if (!Interface.getGamePad()[moves[0]][moves[1]].equals(" ")){
            return Constants.ErrorCodes.A_OK;
        }
        return Constants.ErrorCodes.INVALID_MOVE;
    }
}
