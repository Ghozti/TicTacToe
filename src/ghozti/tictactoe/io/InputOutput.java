package ghozti.tictactoe.io;

import ghozti.tictactoe.players.Player;
import ghozti.tictactoe.ui.Interface;

import java.util.Scanner;

public class InputOutput {

    String playerMove, aiMove;

    public InputOutput(String playerMove,String aiMove){
        this.playerMove = playerMove;
        this.aiMove = aiMove;
    }

    public void playerMove(String moveType){
        Scanner scanner = new Scanner(System.in);
        IOHandler handler = new IOHandler();

        String moveStr;

        System.out.println("Your move: ");
        moveStr = scanner.nextLine();

        int[] moves = handler.convertStrToMove(moveStr);

        Player.setLastPlayerMove(moves);

        Interface.addToGamePad(playerMove,moves);
    }
}
