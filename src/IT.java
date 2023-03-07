import java.util.Scanner;
public class IT {
    static Scanner scan = new Scanner(System.in);
    static int employee_number;

    public static void main(String[] args){
        IT one = new IT();
        double grand_total = 0;
        char again = 'y';
        while(again == 'y'){
            grand_total += one.menu();
            System.out.println("\nEnter more employees?");
            again = scan.next().charAt(0);
            if(again != 'y' && again != 'n'){
                System.out.println("Can you repeat that?");
                again = scan.next().charAt(0);
            }
        }
        System.out.printf("Total Salary is: %.2f ",  grand_total);
        System.out.println("\nTotal employees: " + employee_number);
    }
    public double menu(){
        System.out.println("MENU CHOICE: ");
        System.out.println("==================");
        System.out.println("1. IT DEPT");
        System.out.println("2. ACCOUNTING DEPT");
        System.out.println("==================");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        return choices(choice);
    }
    public double choices(int ch){
        if(ch == 1){
            System.out.println("IT DEPARTMENT");
        }
        else if(ch == 2){
            System.out.println("ACCOUNTING DEPARTMENT");
        }
        System.out.println("===================");
        return employee();
    }
    public double employee(){
        double salary_total = 0;
        System.out.print("Enter number of employees: ");
        int employees = scan.nextInt();
        for(int i = 0; i < employees; i++){
            getEmployee_number();
            System.out.print("Enter emp id: ");
            int id = scan.nextInt();
            System.out.print("Enter emp name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Enter emp salary: ");
            double salary = scan.nextDouble();
            salary_total+= salary;
            double annual_salary = salary * 12;
            System.out.printf("Annual Salary is: %.2f ",  annual_salary);
            System.out.println();
        }
        return salary_total;
    }
    public int getEmployee_number(){
        employee_number++;
        return employee_number;
    }
}
