package abstracts.employees;

import abstracts.employees.myEmployees.Deepika;
import abstracts.employees.myEmployees.Gio;
import abstracts.employees.myEmployees.Kranthi;
import abstracts.employees.myEmployees.Latika;

import java.util.ArrayList;
import java.util.List;

public class RunDaTing {

    public static void main(String[] args) {
        exampleForInheritance();
    }

    public static void exampleForInheritance() {
        List<Employees> myEmps = new ArrayList<>();

        myEmps.add(new Gio());
        myEmps.add(new Deepika());
        myEmps.add(new Kranthi());
        myEmps.add(new Latika());

        Employees myCurrentEmp = myEmps.get(2);

        for (Employees employee: myEmps) {
            System.out.println(employee.getName() + " | " + employee.getAge() + " | " + employee.getPosition() + " | " + employee.getSalary());
        }
    }
}
