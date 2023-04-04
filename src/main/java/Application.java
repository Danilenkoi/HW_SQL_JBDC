import javax.persistence.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);
        Employee employee = new Employee("Gleb", "Petrov", "male", 39, city);
        employeeDAO.changeAge(employee, 30);
        employeeDAO.addEmployee(employee);
        employeeDAO.addEmployee(employee);
        employeeDAO.changeFirstName(employee, "Luna");
        employeeDAO.changeFirstName(employeeDAO.getEmployeeByID(12), "Georg");
        System.out.println(employeeDAO.getEmployeeList());
        employeeDAO.removeEmployeeByID(8);
        System.out.println(employee.getCity());
        employeeDAO.removeEmployeeByID(3);
        System.out.println(city);


        entityManager.close();
        entityManagerFactory.close();
    }
}

