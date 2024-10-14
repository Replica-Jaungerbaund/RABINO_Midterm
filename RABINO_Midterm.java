import java.util.Scanner;

// Super Class Person
class Person{
    // Fields of Main Class Person
        String name;
        int age;
         
    // Constructor of the Fields
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        
    // Method to output the information
        void displayInfo(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
}

// Sub Class Student
class Student extends Person{
    // Fields of Sub Class Student
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;
    
    // Constructor of the Sub Class Student
    public Student(String name, int age, String studentID, String course, int units){
        // Inheriting the Super Class' Fields
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
    
    // Method to calculate the Total Fee
    public double calculateFees() {
        return units * feePerUnit;
    }    
    
    // Overriding the displayInfo to add more output
    void displayInfo(){
        System.out.println("STUDENT INFORMATION");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees() + "\n");    
    }
    
    // Information to output
    static Student Info1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student's Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Units: ");
        int units = sc.nextInt();
        System.out.println();
        return new Student(name, age, studentID, course, units);
    }
}

// Sub Class Instructor
class Instructor extends Person{
    // Fields of Sub Class Instructor
    String employeeID;
    String department;
    double salary;
    
    // Constructor of the Sub Class Insructor
    public Instructor(String name, int age, String employeeID, String department, double salary){
        // Inheriting from the Super Class Person
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Overriding the displayInfo to add more output
    void displayInfo(){
        System.out.println("INSTRUCTOR INFORMATION");
        System.out.println("Instructor's Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    
    // Information to output
    static Instructor Info2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Instructor's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Instructor's Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline
        System.out.print("Enter Employee ID: ");
        String employeeID = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.println();
        return new Instructor(name, age, employeeID, department, salary);
    }
}

// Main Class 
public class RABINO_Midterm {
    static void printDetails(Person p){
        p.displayInfo();
    }
    
    public static void main(String[] args){
        // Two Student Objects
        Student D = Student.Info1();
        printDetails(D);
        Student M = Student.Info1();
        printDetails(M);
        
        // Two Instructor Objects
        Instructor J = Instructor.Info2();
        printDetails(J);
        Instructor R = Instructor.Info2();
        printDetails(R);
    }
}