import java.util.ArrayList;
import java.util.List;

public class Student {


    String firstName;
    String lastName;

    String phone;

    public void courseList(){
        Course programming = new Course();
        StudentCourse sc1 = new StudentCourse();
        sc1.code=" PR11";
        programming.courseName="Programming";
        programming.doctorName="Mohammed";
        programming.hours=3;

        Course data = new Course();
        StudentCourse sc2 = new StudentCourse();

        sc2.code= "DA22";
        data.courseName= "Data Structure";
        data.doctorName= "Njwa";
        data.hours= 4;

        Course project = new Course();
        StudentCourse sc3 = new StudentCourse();

        sc3.code= " PM45";
        project.courseName= "Pro Management ";
        project.doctorName= "Maryam";
        project.hours= 4;

        Course design = new Course();
        StudentCourse sc4 = new StudentCourse();

        sc4.code= " DE32";
        design.courseName= "Design Pattren";
        design.doctorName= "Ahmed";
        design.hours= 3;

        Course system = new Course();
        StudentCourse sc5 = new StudentCourse();

        sc5.code= " SY13";
        system.courseName= "System Analysis";
        system.doctorName= "Badr";
        system.hours= 5;



        List<Course> courses = new ArrayList<>();
        courses.add(programming);
        courses.add(data);
        courses.add(project);
        courses.add(design);
        courses.add(system);

        List<StudentCourse> studentCourses = new ArrayList<>();
        studentCourses.add(sc1);
        studentCourses.add(sc2);
        studentCourses.add(sc3);
        studentCourses.add(sc4);
        studentCourses.add(sc5);



        String [] arr ={  " course code ", " course name" , " doctor name", " hours "};
        for (int i = 0; i<4; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print("\t"+studentCourses.get(i).code + "\t");
            System.out.print("\t"+courses.get(i).courseName + "\t");
            System.out.print("\t\t"+ courses.get(i).doctorName + "\t");
            System.out.println(courses.get(i).hours + " hours\t\t");

        }
    }

}
