import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    // a.
    List <Employee> createEmployee(Employee employee);

    //b.
    List <Employee> getEmployeeById(int id);

    //c.
    List <Employee> getAllEmployee();

    //d.
    List <Employee> updateEmployee(Employee employee);

    //e.
    List <Employee> deleteEmployee(int id);
}
