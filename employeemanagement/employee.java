import java.util.ArrayList;
import java.util.List;

// Employee class definition
class Employee {
    // Attributes
    private int id;
    private String name;
    private double salary;
    
    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------");
    }
    
    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an ArrayList to store Employee objects
        List<Employee> employees = new ArrayList<>();
        
        // Create 3 Employee objects
        Employee emp1 = new Employee(1, "Ashutosh Jena", 500000.00);
        Employee emp2 = new Employee(2, "Suraj Jena", 4500000);
        Employee emp3 = new Employee(3, "Kishan  Singh", 480000.00);
        
        // Add employees to the list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        
        // Display details of all employees
        System.out.println("Employee Details:");
        System.out.println("=================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
