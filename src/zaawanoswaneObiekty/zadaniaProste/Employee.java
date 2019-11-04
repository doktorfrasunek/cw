package zaawanoswaneObiekty.zadaniaProste;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private static int lastID=1;
    private int iD;
    private int salary;
    private String position;

    public Employee(int salary, String position) {
        this.salary = salary;
        this.position = position;
        iD= lastID++;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getiD() {
        return iD;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("(");
       stringBuilder.append(iD);
       stringBuilder.append(") (");
       stringBuilder.append(position);
       stringBuilder.append("): ");
       stringBuilder.append(salary);
       return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(
                new Employee(12000,"Programmer")
        );
        employees.add(
                new Employee(4500,"Secretary")
        );
        employees.add(
                new Employee(8000,"Programmer")
        );
        employees.add(
                new Employee(6000,"Programmer")
        );
        employees.add(
                new Employee(5000,"Programmer")
        );
        int sum=0;
        int count=0;
        for (Employee emp:
             employees) {
            System.out.println(emp);
            if (emp.getPosition().equals("Programmer")) {
                sum += 12 * emp.getSalary();
                count++;

            }
        }
        System.out.println("Avarage annual salary: " + sum/(double)count);
        List<Employee> newList= new ArrayList<>();
        for (Employee emp:
             employees) {
            if(emp.getSalary()>= 7000)
                newList.add(emp);
        }
        System.out.print("Employees earning more than 7k: ");
        for (Employee emp : newList
             ) {
            System.out.print(emp.getiD()+", ");
        }
    }
}
