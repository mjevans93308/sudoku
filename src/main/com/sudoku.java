package src.main.com;

/**
 * Created by matthewe on 1/31/17.
 */
public class sudoku {
    public static void main(String[] args){
        drawBoard();
    }

    public static void drawBoard(){
        for (short row = 0; row < 10; ++row){
            for (short col = 0; col < 10; ++col) {
                if (row == 0) {
                    System.out.print(row + " ");
                } else if(col == 0){
                    System.out.print(col + "\n");
                }
            }
        }
    }
}
