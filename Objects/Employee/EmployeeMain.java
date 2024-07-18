package Objects.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1  = new Employee("Vinoth", 1122, 12500.50d, "Manager", 'M');
        Employee emp2  = new Employee("Riya", 1123, 55555.55d, "CEO", 'F');
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
