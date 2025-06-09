import java.util.*;
public class Main {
    static Scanner sc=new Scanner(System.in);
    static List<Employee>employees=new ArrayList<>();
    public static void main(String[] args) {
        while(true){
        System.out.println("---Employee Management System---");
        System.out.println("1.Add Employee");
        System.out.println("2.View Employee");
        System.out.println("3.Search by ID");
        System.out.println("4.Update Salary");
        System.out.println("5.Delete Employee");
        System.out.println("6.Exit");
        System.out.println("Enter a option");
        int option=sc.nextInt();
        switch(option) {
            case 1 -> addEmployee();
            case 2 -> viewEmployee();
            case 3 -> searchBYid();
            case 4 -> updateSalary();
            case 5 -> deleteEmployee();
            case 6 -> {
                System.out.println("Exiting....");
                return;
            }
            default -> System.out.println("Invalid number");
        }
        }
    }

static void addEmployee(){
    System.out.println("Enter ID:");
    int ID=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter name:");
    String name=sc.nextLine();
    System.out.println("Enter department:");
    String department=sc.nextLine();
    System.out.println("Enter salary:");
    double salary=sc.nextDouble();
    employees.add(new Employee(ID,name,department,salary));
    System.out.println("Employee added successfully!");
}
static void viewEmployee(){
        if(employees.isEmpty()){
            System.out.println("No employees to display.");
        }for(Employee e:employees){
            e.displayInfo();
    }
    }
    static void searchBYid(){
        System.out.println("Enter employee ID:");
        int ID=sc.nextInt();
        for(Employee e:employees){
            if(e.getID()==ID){
                e.displayInfo();
            }
        }
        System.out.println("Employee not found.");
    }
    static void updateSalary(){
        System.out.println("Enter employee ID:");
        int id=sc.nextInt();
        for(Employee e:employees){
            if(e.getID()==id){
                System.out.println("Enter new Salary:");
                double salary=sc.nextDouble();
                e.setSalary(salary);
                System.out.println("Salary updated successfully!");
            }
        }
        System.out.println("Employee not found");
    }
    static void deleteEmployee(){
        System.out.println("Enter employee ID:");
        int id=sc.nextInt();
        Iterator<Employee>iterator=employees.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getID()==id){
                iterator.remove();
                System.out.println("Employee deleted");

            }
        }
        System.out.println("Employee not found.");
    }
}