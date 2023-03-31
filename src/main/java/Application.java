import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        List <Employee> staffAll = employeeDAO.getAllEmployee();

        for (Employee employee : staffAll) {
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("First_name: " + employee.getFirst_name());
            System.out.println("Last_name: " + employee.getLast_name());
            System.out.println("Gender: " + employee.getGender());
            System.out.println("Age: " + employee.getAge());
            System.out.println("City_id: " + employee.getCity_id());
        }
    }
}

