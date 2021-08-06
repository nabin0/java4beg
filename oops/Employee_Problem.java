class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Employee_Problem {

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.salary = 1200;
        System.out.println(obj.getSalary()); //Getter to get salary
        obj.name = "Tony";
        obj.setName("MyNewName"); //Setter updating new name
        System.out.println(obj.getName()); //Getter to get name
    }
}