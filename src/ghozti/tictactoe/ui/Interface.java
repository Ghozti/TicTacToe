package ghozti.tictactoe.ui;

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
}
