import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {

    String courseName;
    String doctorName;

    String code;

    int hours ;


    public static void enrollCourse(){
        Scanner read = new Scanner(System.in);

       for (int i=0; i<5; i++){

           Student s =new Student();

           StudentCourse studentIdCo = new StudentCourse();

           System.out.println("Please Enter Your Information To register .. ");

           System.out.println("Enter your ID : ");
           studentIdCo.studentId = read.nextInt();

           System.out.println("Enter your first name : ");
           s.firstName = read.next();

           System.out.println("Enter your last name : ");
           s.lastName = read.next();

           System.out.println("Enter your phone number : ");
           s.phone = read.next();

           System.out.println("Enter course code which you want to enroll into : ");
           studentIdCo.code = read.next();


           List<Student> students = new ArrayList<>();
           students.add(s);

           List<StudentCourse> stIdC = new ArrayList<>();
           stIdC.add(studentIdCo);

           //Show Student register info
           String [] arr ={  " Student ID ", " Student name" , " Phone", " Course code "};
           for (int j = 0; j<4; j++){
               System.out.print(arr[j] + "\t");
           }
           System.out.println();
           for (int y = 0; y < students.size(); y++) {
               System.out.print("\t"+stIdC.get(y).studentId + "\t");
               System.out.print("\t"+students.get(y).firstName +" " +students.get(y).lastName+ "\t");
               System.out.print( students.get(y).phone + "\t");
               System.out.println(stIdC.get(y).code + "\t\t");

           }

       }






    }


}
