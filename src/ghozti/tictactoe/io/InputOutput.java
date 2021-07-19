package ghozti.tictactoe.io;

import ghozti.tictactoe.ui.Interface;

import java.util.Scanner;

public class InputOutput {

    public void playerMove(String moveType){
        Scanner scanner = new Scanner(System.in);
        IOHandler handler = new IOHandler();

        String moveStr;

        System.out.println("Your move: ");
        moveStr = scanner.nextLine();

        int[] moves = handler.convertStrToMove(moveStr);

        Interface.addToGamePad("X",moves);
    }
}
