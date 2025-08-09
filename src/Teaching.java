import java.util.Scanner;

public class Teaching extends Office{
    String designation;
    void set_data(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the employee number");
        employee_number = s.nextInt();

        System.out.println("Enter the employee name");
        employee_name = s.nextLine();

        System.out.println("Enter the employee salary");
        salary = s.nextInt();

        System.out.println("Enter the employee designation");
        designation = s.nextLine();
    }

    public void Get_data(){
            System.out.println("the employees name and id and designation are " + employee_name + " and " + employee_number + " and " + designation + "and their salary is " + salary);
    }
}
