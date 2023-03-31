import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDAOImpl implements EmployeeDAO {
    final String user = "postgres";
    final String password = "Admin1";
    final String url = "jdbc:postgresql://localhost:5433/skypro";

    @Override
    public List<Employee> createEmployee(Employee employee) {
        List<Employee> staffCreate = new ArrayList<>();

        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("INSERT INTO employee (id, first_name, last_name, gender, age, city_id)" +
                             "VALUES (15 'Gosha', 'Capitanov', 'man', 20, 4)")){

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfEmployee = resultSet.getInt("id");
                System.out.println("ID: " + idOfEmployee);

                String firstOfEmployee = resultSet.getString("first_name");
                String lastOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt("age");
                int cityIdOfEmployee = resultSet.getInt("city_id");

                System.out.println("Имя: " + firstOfEmployee);
                System.out.println("Фамилия: " + lastOfEmployee);
                System.out.println("Пол: " + genderOfEmployee);
                System.out.println("Возраст: " + ageOfEmployee);
                System.out.println("ID города: " + cityIdOfEmployee);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }

        return staffCreate;
    }

    @Override
    public List<Employee> getEmployeeById(int id) {
        List<Employee> staffId = new ArrayList<>();

        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee WHERE id = 3")){


            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfEmployee = resultSet.getInt("id");
                System.out.println("ID: " + idOfEmployee);

                String firstOfEmployee = resultSet.getString("first_name");
                String lastOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt("age");
                int cityIdOfEmployee = resultSet.getInt("city_id");

                System.out.println("Имя: " + firstOfEmployee);
                System.out.println("Фамилия: " + lastOfEmployee);
                System.out.println("Пол: " + genderOfEmployee);
                System.out.println("Возраст: " + ageOfEmployee);
                System.out.println("ID города: " + cityIdOfEmployee);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }

        return staffId;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> staffAll = new ArrayList<>();

        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee")) {


            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfEmployee = resultSet.getInt("id");
                System.out.println("ID: " + idOfEmployee);

                String firstOfEmployee = resultSet.getString("first_name");
                String lastOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt("age");
                int cityIdOfEmployee = resultSet.getInt("city_id");

                System.out.println("Имя: " + firstOfEmployee);
                System.out.println("Фамилия: " + lastOfEmployee);
                System.out.println("Пол: " + genderOfEmployee);
                System.out.println("Возраст: " + ageOfEmployee);
                System.out.println("ID города: " + cityIdOfEmployee);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }
        return staffAll;
    }

    @Override
    public List<Employee> updateEmployee(Employee employee) {
        List<Employee> staffUpdate = new ArrayList<>();
        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("UPDATE employee SET first_name = 'Sasha' WHERE id = 5")){


            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfEmployee = resultSet.getInt("id");
                System.out.println("ID: " + idOfEmployee);

                String firstOfEmployee = resultSet.getString("first_name");
                String lastOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt("age");
                int cityIdOfEmployee = resultSet.getInt("city_id");

                System.out.println("Имя: " + firstOfEmployee);
                System.out.println("Фамилия: " + lastOfEmployee);
                System.out.println("Пол: " + genderOfEmployee);
                System.out.println("Возраст: " + ageOfEmployee);
                System.out.println("ID города: " + cityIdOfEmployee);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }
        return staffUpdate;
    }

    @Override
    public List<Employee> deleteEmployee(int id) {
        List<Employee> staffDelete = new ArrayList<>();
        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("DELETE FROM employee WHERE id = 2")){


            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfEmployee = resultSet.getInt("id");
                System.out.println("ID: " + idOfEmployee);

                String firstOfEmployee = resultSet.getString("first_name");
                String lastOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                int ageOfEmployee = resultSet.getInt("age");
                int cityIdOfEmployee = resultSet.getInt("city_id");

                System.out.println("Имя: " + firstOfEmployee);
                System.out.println("Фамилия: " + lastOfEmployee);
                System.out.println("Пол: " + genderOfEmployee);
                System.out.println("Возраст: " + ageOfEmployee);
                System.out.println("ID города: " + cityIdOfEmployee);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }
        return staffDelete;
    }
}
