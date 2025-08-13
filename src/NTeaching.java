import java.util.Scanner;

public class NTeaching extends Office{
    String designation;

    void set_data(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the employee number");
        employee_number = s.nextInt();

        System.out.println("Enter the employee name");
        employee_name = s.next();

        System.out.println("Enter the employee salary");
        salary = s.nextInt();

        System.out.println("Enter the employee designation");
        designation = s.next();
    }

    public void Get_data(){
            System.out.println("the employees number: " + employee_number);
            System.out.println("the employees name: " + employee_name);
            System.out.println("the employees salary: " + salary);
            System.out.println("the employees designation: " + designation);
            System.out.println("=============================================================");
    }
}
