package ghozti.tictactoe.io;

import ghozti.tictactoe.constants.Constants;
import ghozti.tictactoe.ui.Interface;

public class IOHandler {

    //will return an error code based on the desired place where the player wants to place the x or o at
    public String verifyPlayerMove(int[] moves){
        if (!Interface.getGamePad()[moves[0]][moves[1]].equals(" ")){
            return Constants.ErrorCodes.A_OK;
        }
        return Constants.ErrorCodes.INVALID_MOVE;
    }

    //converts a string into coordinates
    public int[] convertStrToMove(String move){
        int[] int_split = new int[1];

        String[] move_split = move.split(",");

        int_split[0] = Integer.parseInt(move_split[0]);
        int_split[1] = Integer.parseInt(move_split[1]);

        return int_split;
    }
}
