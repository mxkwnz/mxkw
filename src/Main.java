import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();

        File file = new File("src\\employee.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            Employee employee = new Employee();
            employee.setName(scanner.next());
            employee.setSurname(scanner.next());
            employee.setAge(Integer.parseInt(scanner.next()));
            employee.setGender(Boolean.parseBoolean(scanner.next()));
            employee.setPosition(scanner.next());
            employee.setSalary(Double.parseDouble(scanner.next()));
            employees.add(employee);
        }
        for(Employee employee : employees){
            System.out.println(employee.toString());
        }
    }
}