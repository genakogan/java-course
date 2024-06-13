public class Employee {
    private String name;
    private int age;
    private double salary;

    private static int employeeID=0;
    public Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        employeeID++;
    }

    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name= name;
    }
    public String getAge(){
        return name;
    }
    public  void setAge(int age){
        if(age>0){
            this.age =age;
        }else {
            System.out.println("Invalid age");
        }
    }
    public String getSalary(){
        return name;
    }
    public void setSalary(double salary){
        if(salary>=0){
            this.salary =salary;
        }else {
            System.out.println("Invalid salary");
        }
    }

    public void displayDetails(){
        System.out.println("Name:" + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary );
    }

    public static int getEmployeeID() {
        return employeeID;
    }
}
