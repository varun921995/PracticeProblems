import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee{

    String name;
    int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Employee e1 = new Employee("John", 18);
        Employee e2 = new Employee("Varun", 8);
        Employee e3 = new Employee("John", 22);
        Employee e4 = new Employee("Tick Tick", 18);
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println(employees.size());
        e3.age=18;
        employees.add(e4);
       for (Employee employee : employees) {
           System.out.println(employee.hashCode() + " " + employee.name);
       }

    }
}