
import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeStore {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Amit", "IT", 50000));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"));
        List<Employee> data = (List<Employee>) ois.readObject();

        for (Employee e : data) {
            System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
        }
        ois.close();
    }
}
