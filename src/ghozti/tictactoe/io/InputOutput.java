package ghozti.tictactoe.io;

import java.util.Scanner;

public class InputOutput {

    public int[] playerMove(String moveType){
        Scanner scanner = new Scanner(System.in);

        String moveStr;
        int[] moves = new int[1];

        System.out.println("Your move: ");
        moveStr = scanner.nextLine();

        return moves;
    }
}
