import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         Employee employee1 = new Employee("Maryam",2333.0);
         Employee employee2 = new Employee("Muna",1223.0);
         Employee employee3 = new Employee("Maha",3761.0);
         Employee employee4 = new Employee("Mai",2500.0);


         Salary salary = new Salary();

         salary.createNewEmp(employee1);
         salary.createNewEmp(employee2);
         salary.createNewEmp(employee3);
         salary.createNewEmp(employee4);



         while (true) {
              System.out.println(" Enter 1 to create new employee or 2 to show employee list");

              int x = scanner.nextInt();
              if (x == 1) {

                   System.out.println("Enter employee name : ");
                   String emName = scanner.next();

                   System.out.println("Enter employee salary : ");
                   double emSalary = scanner.nextDouble();

                   Employee newEmployee = new Employee(emName,emSalary);
                   salary.createNewEmp(newEmployee);

                   salary.showList();

              }else if (x == 2) {
                   salary.showList();
              }
              else {
                   System.out.println("you will exist , thank you !");
                   break;
              }



         }


    }
}