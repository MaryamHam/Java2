import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.HashSet;
import java.util.Set;


// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = {{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};

        for (char[] row : board){
            System.out.println(Arrays.toString(row));
        }
        String letters = scanner.nextLine().trim();

        Set<Character> lettersSet = new HashSet<>();
        for (char c : letters.toCharArray()) {
            lettersSet.add(c);
        }

        System.out.println("please enter word ");
        String word = scanner.nextLine().trim();

        boolean allCharsExist = true;
        for (char c : word.toCharArray()) {
            if (!lettersSet.contains(c)) {
                allCharsExist = false;
                break;
            }
        }

        if (allCharsExist) {
            System.out.println("Great, all char in array");
        } else {
            System.out.println("Sorry, not all char in array");
        }


    }
}