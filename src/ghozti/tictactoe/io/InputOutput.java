package ghozti.tictactoe.io;

import java.util.Scanner;

public class InputOutput {

    public int[] playerMove(String moveType){
        Scanner scanner = new Scanner(System.in);

        String moveStr;

        System.out.println("Your move: ");
        moveStr = scanner.nextLine();

        return playerMove(moveStr);
    }
}
