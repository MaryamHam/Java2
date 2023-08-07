import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //task 2
        Scanner read = new Scanner(System.in);
        System.out.println("please enter your email to login");
        String email = read.next();
        System.out.println("please enter your password");
        String password = read.next();


        if( email.equals("Mary.algharibi@gmail.com") && password.equals("Hhh$123")){
            System.out.println("login successful");
        }else {
            System.out.println("sorry your email is not correct ");
        }
    }
}