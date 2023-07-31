import java.util.Arrays;
import java.util.Scanner;
//Given a 2D board and a word, find if the word exists in the grid. The word can be constructed from letters of sequentially adjacent cells,
// where "adjacent" cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
public class Main {
    public static void main(String[] args) {

        char [][] board = {
                {'A','B','C','D'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        for (char[] row :board){
            System.out.println(Arrays.toString(row));
        }

        Scanner read = new Scanner(System.in);
       // String letters= read.nextLine().trim();

        System.out.println(" please enter word ");
        String word = read.nextLine();

        char[] cs= word.toCharArray();
        boolean isThisWordValid = true;

        for (char c: cs) {
            System.out.println(c + " : " +isExist(c , board));
            if (!isExist(c,board)){
                isThisWordValid = false;
                break;
            }
        }

        System.out.println( " this word is "+ isThisWordValid);
        }


        static boolean isExist(char c, char[][] board){
          for (int i=0; i < board.length; i++){
              for (int j=0; j < board[0].length; j++){

                  if(c == board[i][j]){

                      return true;
                  }
              }


          }
          return false;
        }

        }

