import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while ( true){
            System.out.println(" enter 0 = paper, 1= rock, 2= scissor");
            int player1 = read.nextInt();

            Random random = new Random();
            int player2 = random.nextInt(2);
            System.out.println(player2);


            if (player1 == player2 ){
                System.out.println( " no winner ");

            }else {
                if (player1 == 0 && player2 ==1|| player1 == 2 && player2 ==0 ||player1 == 1 && player2 ==2  ){
                    System.out.println( "player 1 is winner");
                }
                else {
                    System.out.println( "player 2 is winner");
                }

            }

        }



    }
}