import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);


        Exam question1 = new Exam(1,"true or false, java same as javaScript ?",2,"false");
        Exam question2 = new Exam(2,"Data type use for real number ?  ",5,"integer");
        Exam question3 = new Exam(3," 1 + 10 = ",2,"11");
        Exam question4 = new Exam(4," 2 * 12 =   ",1,"24");
        Exam question5 = new Exam(5," 3 * 5 =  ",3,"15");
        Exam question6 = new Exam(6," 50 /  25 =  ",2,"2");
        Exam question7 = new Exam(7," 33 -10 =   ",2,"23");
        Exam question8 = new Exam(8," 60 / 30 =  ",1.5,"2");
        Exam question9 = new Exam(9," 44 + 55 =  ",2.5,"99");
        Exam question10 = new Exam(10," 90 - 75 =  ",2,"15");


        List<Exam> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);

        
        double total = 0.0;

        for (int i = 0 ; i < 10; i++){
            System.out.println();
            System.out.print("question "+ questions.get(i).questionID + " is  "+questions.get(i).question + "\t");

            String userAnswer =read.next();
            if (userAnswer.equals(questions.get(i).rightAnswer)){
                total += questions.get(i).degree;

            }
        }

        System.out.println( " your degree is: "+ total);
    }
}