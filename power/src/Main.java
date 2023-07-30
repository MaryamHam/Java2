import java.util.Scanner;
//: Implement pow(x, n), which calculates x raised to the power n (x^n).
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println(" enter the number : ");
        double number = read.nextDouble();

        System.out.println(" enter the power : ");
        double power = read.nextDouble();

        double result = 1 ;

        while (power != 0) {
            result *= number;
            power--;
        }



        System.out.println("Answer = " + result);



    }
}