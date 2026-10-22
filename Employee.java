package scannerpractice;

public class Employee {
    int id;
    String name;
    double salary;
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Sharon", 25000.0);
        e.display();
    }
}