import javax.persistence.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);
        CityDAO cityDAO = new CityDAOImpl(entityManager);
        City city = new City("Vorkuta");
        cityDAO.addCity(city);
        Employee employee = new Employee("Nicholas", "Sour", "female", 30, city);
        employeeDAO.changeAge(employee, 30);
        employeeDAO.addEmployee(employee);
        employeeDAO.addEmployee(employee);
        employeeDAO.changeFirstName(employee, "Anna");
        employeeDAO.changeFirstName(employeeDAO.getEmployeeByID(3), "Gosha");
        System.out.println(employeeDAO.getEmployeeList());
        employeeDAO.removeEmployeeByID(8);
        System.out.println(employee.getCity());
        employeeDAO.removeEmployeeByID(3);
        System.out.println(city);
        city = cityDAO.getCityByID(4);

        cityDAO.removeCityByID(4);
        System.out.println(city);


        entityManager.close();
        entityManagerFactory.close();
    }
}

