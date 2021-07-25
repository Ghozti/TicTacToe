package ghozti.tictactoe.ui;

import ghozti.tictactoe.constants.Constants;
import ghozti.tictactoe.game.Game;
import ghozti.tictactoe.io.IOHandler;

import java.util.ArrayList;

public class Interface {

    //game pad multid array
    private static String[][] gamePad = {
            {"      ","|","      ","|","      "},
            {"------|","------","|------"},
            {"      ","|","      ","|","      "},
            {"------|","------","|------"},
            {"      ","|","      ","|","      "}
    };

    //returns gamepad
    public static String[][] getGamePad(){
        return gamePad;
    }

    //displays the game pad
    public static void displayUI(){
        for(String[] arr  : gamePad){
            StringBuilder row = new StringBuilder();
            for(String str : arr){
                row.append(str);
            }
            System.out.println(row.toString());
        }

        displayAvailableMoves();
    }

    //allows one to add an x or o to the game pad. also verifies wether the action can be made or not
    public static void addToGamePad(String move, int[] coordinates){
        if(new IOHandler().verifyPlayerMove(coordinates).equals(Constants.ErrorCodes.A_OK)) {
            gamePad[coordinates[0]][coordinates[1]] = "  " + move + "  ";
        }else {
            System.out.println("INVALID MOVE, YOUR TURN HAS EXPIRED");
        }
        displayUI();
    }

    //resets thr gamepad to a default blank one
    public static void resetTable(){
        gamePad = new String[][]{
                {"      ","|","      ","|","      "},
                {"------|","------","|------"},
                {"      ","|","      ","|","      "},
                {"------|","------","|------"},
                {"      ","|","      ","|","      "}
        };
    }

    public static boolean spotAvaliable(int x, int y){

        try {
            if(gamePad[y][x].equals("      ")){
                return true;
            }
        }catch (IndexOutOfBoundsException e){
            return false;
        }

        return gamePad[y][x].equals("      ");
    }

    private static void displayAvailableMoves(){

        ArrayList<String> available_spots = new ArrayList<>();

        for(int i = 0; i < gamePad.length; i++){
            for (int j = 0; j < gamePad[i].length; j++){
                if (gamePad[i][j].equals("      ")){
                    available_spots.add("[Available:] " + "[" + i + " , " + j + "]");
                }
            }
        }

        for(String i : available_spots){
            System.out.println(i);
        }
    }

    public static void check_win(){

        String winning_str = "X    X    X";
        String winning_str_AI = "O    O    O";

        /*VERTICAL************************************************************************************************/

        if ((gamePad[0][0] + gamePad[2][0] + gamePad[4][0]).trim().equals(winning_str) ||
                (gamePad[0][0] + gamePad[2][0] + gamePad[4][0]).equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        if ((gamePad[0][2] + gamePad[2][2] + gamePad[4][2]).trim().equals(winning_str) ||
                (gamePad[0][2] + gamePad[2][2] + gamePad[4][2]).equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        if ((gamePad[0][4] + gamePad[2][4] + gamePad[4][4]).trim().equals(winning_str) ||
                (gamePad[0][4] + gamePad[2][4] + gamePad[4][4]).equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        /*HORIZONTAL************************************************************************************************/

        if ((gamePad[0][0] + gamePad[0][2] + gamePad[0][4]).trim().equals(winning_str) ||
                (gamePad[0][0] + gamePad[0][2] + gamePad[0][4]).trim().equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        if ((gamePad[2][0] + gamePad[2][2] + gamePad[2][4]).trim().equals(winning_str) ||
                (gamePad[2][0] + gamePad[2][2] + gamePad[2][4]).trim().equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        if ((gamePad[4][0] + gamePad[4][2] + gamePad[4][4]).trim().equals(winning_str) ||
                (gamePad[4][0] + gamePad[4][2] + gamePad[4][4]).trim().equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        /*DIAGONAL************************************************************************************************/
        if ((gamePad[0][0] + gamePad[2][2] + gamePad[4][4]).trim().equals(winning_str) ||
                (gamePad[0][0] + gamePad[2][2] + gamePad[4][4]).trim().equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }

        if ((gamePad[0][4] + gamePad[2][2] + gamePad[4][0]).trim().equals(winning_str) ||
                (gamePad[0][4] + gamePad[2][2] + gamePad[4][0]).trim().equals(winning_str_AI)){
            System.out.println("GAME!");
            Game.setWin(true);
        }
    }
}
