package ghozti.tictactoe.game;

import ghozti.tictactoe.players.AI;
import ghozti.tictactoe.players.Player;

import java.util.Scanner;

public class Game {

    public Game(){

    }

    private static Player player;
    private static AI ai;

    public static Player getPlayer(){
        return player;
    }

    public static AI getAI(){
        return ai;
    }

    private void startGame(){
        System.out.println("Welcome to tic tac toe!\n" +
                "please enter what you want to use:\n" +
                "[X]\n" +
                "[O]");

        Scanner scanner = new Scanner(System.in);

        player = new Player(scanner.nextLine());

        if (player.getMove().equals("X")){
            ai = new AI("O");
        }else {
            ai = new AI("X");
        }
    }
}
