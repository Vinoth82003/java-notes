import java.util.Scanner;

class Company{
    private double base_salary;

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    Company(){}// Non argumented constructor
    Company(double base_salary){
        if (base_salary >= 0) {
            this.base_salary = base_salary;
        }else{
            System.out.println("Don't mention minus value....:(");
        }
    }

    public double calculateSalary(int numberOfHours){
        double hrSalary = ((getBase_salary()/30)/9);

        return (hrSalary * numberOfHours);
    }

    public double calculateSalary(double bonus){
        return (getBase_salary()+bonus);
    }

}

class Employee extends Company{
    int numberOfHours;
    Employee(){}
    Employee(int numberOfHours, double base_salary){
        super(base_salary);
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double calculateSalary(int numberOfHours){
        return super.calculateSalary(numberOfHours);
    }

}

class Manager extends Company{
    double bonus;
    Manager(){}// No argumented constructor
    Manager(double bonus, double base_salary){
        super(base_salary);
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(double bonus){
        return super.calculateSalary(bonus);
    }
}

public class CompanyDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------");
        Company com;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your choice ..\n1. Calculate Employee\n2. Calculate Manager\n3. Exit");
            int ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter No of hours : ");
                    int nohours = input.nextInt();
                    System.out.print("Enter Base Salary : ");
                    double base_salary = input.nextDouble();
                    com = new Employee(nohours, base_salary);
                    Employee employee = (Employee) com;
                    System.out.println(employee.calculateSalary(nohours));
                    break;
                case 2:
                    System.out.print("Enter Bonus for Manger : ");
                    double bonus = input.nextDouble();
                    System.out.print("Enter Base salary : ");
                    double baseSalary = input.nextDouble();
                    com = new Manager(bonus, baseSalary);
                    Manager manager = (Manager) com;
                    System.out.println(manager.calculateSalary(bonus));
                    break;
            
                default:
                    System.out.println("Exiting.............");
                    flag = false;
                    break;
            }
        }

        System.out.println("------------------------------");
    }
}