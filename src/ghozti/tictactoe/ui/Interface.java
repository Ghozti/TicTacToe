package ghozti.tictactoe.ui;

import ghozti.tictactoe.constants.Constants;
import ghozti.tictactoe.io.IOHandler;

public class Interface {

    //game pad multid array
    private static String[][] gamePad = {
            {"      |","      ","|      "},
            {"------|","------","|------"},
            {"      |","      ","|      "},
            {"------|","------","|------"},
            {"      |","      ","|      "},
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
    }

    //allows one to add an x or o to the game pad. also verifies wether the action can be made or not
    public static void addToGamePad(String move, int[] coordinates){
        if(new IOHandler().verifyPlayerMove(coordinates).equals(Constants.ErrorCodes.A_OK)) {
            gamePad[coordinates[0]][coordinates[1]] = move;
            displayUI();
        }else {
            System.out.println("INVALID MOVE, YOUR TURN HAS EXPIRED");
            displayUI();
        }
    }

    //resets thr gamepad to a default blank one
    public static void resetTable(){
        gamePad = new String[][]{
                {"","",""},
                {"","",""},
                {"","",""}
        };
    }
}
