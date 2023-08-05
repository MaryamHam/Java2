import java.util.ArrayList;
import java.util.List;

public class Salary {

    List<Employee> employees = new ArrayList<>();

    void createNewEmp(Employee employee){
        employees.add(employee);

    }

    void showList(){

        String [] arr ={  "Employee name", "   Salary "};
        for (int i = 0; i<2; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (Employee employee : employees) {

            System.out.println(employee.name + " \t\t\t\t"+ employee.salary);
        }
    }



}
