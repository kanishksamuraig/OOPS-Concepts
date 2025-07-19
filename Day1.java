
import java.util.*;

class Employee {

    private String name;
    private int regno;
    private String address;

    public Employee(String name, int regno, String address) {
        this.name = name;
        this.regno = regno;
        this.address = address;
    }

    public Employee() {
    }

    void setDetails(String name, int regno, String address) {
        this.name = name;
        this.regno = regno;
        this.address = address;
    }

    void getDetails() {
        System.out.println("Name:" + this.name + "\nRegno:" + this.regno + "\nAddress:" + this.address);
    }

    void setMultiple(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee: " + (i + 1));
            System.out.print("Enter Employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee registration no: ");
            int regno = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Employee's address: ");
            String address = sc.nextLine();
            employees[i] = new Employee(name, regno, address); // set in array
        }
    }

    void getMultiple(Employee[] employees) {
        int i = 1;
        for (Employee employee : employees) {
            System.out.println("Employee:" + (i++));
            employee.getDetails();
        }
    }

}

public class Day1 {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*List<String> names = new ArrayList<String>();
        names.add("Shruthi");
        names.add("Kanishk");
        names.add("daniel");
        names.add("Raphael");
        names.add("Uriel");
        //for each loop
        for (String name : names) {
            System.out.println(name);
        }
        int i = 0;
        //Do while loop
        do {
            System.out.println(names.get(i));
            i++;
        } while (i < names.size());
         */

        System.out.print("Enter the number of employees:");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        Employee s = new Employee();
        s.setMultiple(employees);
        s.getMultiple(employees);

    }
}
