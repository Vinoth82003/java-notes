package Objects.Employee;

public class Employee {
    static String company_name = "VIRO Tech company";
    String name;
    int empid;
    double salary;
    String designation;
    char gender;

    Employee(String name, int empid, double salary, String designation, char gender){
        this.name = name;
        this.empid = empid;
        this.salary = salary;
        this.designation = designation;
        this.gender = gender;
    }

    public  void displayDetails(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Company name : "+company_name);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Designatio : "+designation);
        System.out.println("Gender : "+gender);
        System.out.println("--------------------------------------------------------");
    }

}
