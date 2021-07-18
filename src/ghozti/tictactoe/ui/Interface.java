package ghozti.tictactoe.ui;

import ghozti.tictactoe.constants.Constants;
import ghozti.tictactoe.io.IOHandler;

public class Interface {

    private static String[][] gamePad = {
            {"","",""},
            {"","",""},
            {"","",""}
    };

    public static String[][] getGamePad(){
        return gamePad;
    }

    public void updateUI(int xMoveCoor, int yMoveCoor, String player){
        if(!gamePad[xMoveCoor][yMoveCoor].equals(" ")){
            gamePad[xMoveCoor][yMoveCoor] = player;
        }else {
            System.out.println("***PLACE ALREADY TAKEN***");
        }
    }

    public void displayUI(){
        for(String[] arr  : gamePad){
            StringBuilder row = new StringBuilder();
            for(String str : arr){
                row.append(str);
            }
            System.out.println(row.toString());
        }
    }

    public static void addToGamePad(String move, int[] coordinates){
        if(new IOHandler().verifyPlayerMove(coordinates).equals(Constants.ErrorCodes.A_OK)) {
            gamePad[coordinates[0]][coordinates[1]] = move;
        }else {
            System.out.println("INVALID MOVE, YOUR TURN HAS EXPIRED");
        }
    }

    public static void resetTable(){
        gamePad = new String[][]{
                {"","",""},
                {"","",""},
                {"","",""}
        };
    }
}
