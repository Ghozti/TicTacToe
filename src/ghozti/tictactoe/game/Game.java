package ghozti.tictactoe.game;

import ghozti.tictactoe.io.InputOutput;
import ghozti.tictactoe.players.AI;
import ghozti.tictactoe.players.Player;
import ghozti.tictactoe.ui.Interface;

import java.util.Scanner;

public class Game {

    public Game(){
        startGame();
    }

    private static Player player;
    private static AI ai;
    private static boolean win = false;

    public static Player getPlayer(){
        return player;
    }

    public static AI getAI(){
        return ai;
    }

    public static boolean getWin(){
        return win;
    }

    public static void setWin(Boolean win){Game.win = win;}

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

        InputOutput inputOutput = new InputOutput();

        while(!win){
            Interface.displayUI();
            inputOutput.playerMove(player.getMove());
            Interface.check_win();
        }
    }
}
