import java.util.Scanner;
//write a function that takes a string as input and returns the string reverse
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String reverse = "";

        System.out.println("Enter word to get reverse : ");
        String word = read.next();

        for( int i = word.length()-1; i>= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        System.out.println( " reverse word is :  "+ reverse);


    }
}