public class Employee{
    private int ID;
    private String name;
    private String department;
    private double salary;
    public Employee(int ID,String name,String department,double salary){
        this.ID=ID;
        this.name= name;
        this.department=department;
        this.salary=salary;
    }
    public int getID(){
        return ID;
    }public String getName(){
        return name;
    }public String getDepartment(){
        return department;
    }public double getSalary(){
        return salary;
    }public void setSalary(double salary){
        this.salary=salary;
    }public void displayInfo(){
        System.out.println("ID : "+ID+" Name: "+name+" Department: "+department+" Salary: "+salary);
    }
}
