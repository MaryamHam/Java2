import java.util.Random;
import java.util.Scanner;

//Pc Will Guess A number and the user will choose a number then you will tell him if larger or less till he choose the right number
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int rightNum = random.nextInt(20);
        System.out.println(" please enter guess number from 0 to 20");
        while (true){

            System.out.println(" enter guess number");
            int guessNum = read.nextInt();


            if (rightNum == guessNum ){
                System.out.println( " Great! correct number right number is:  "+ rightNum);
                rightNum = random.nextInt(20);
            }else {
                if ( rightNum > guessNum){
                    System.out.println( "right number is grater than " + guessNum);
                }
                else {
                    System.out.println( "right number is less than "+ guessNum);
                }

            }

        }
    }
}