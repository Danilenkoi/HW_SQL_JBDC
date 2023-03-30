import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "Admin1";
        final String url = "jdbc:postgresql://localhost:5433/skypro";
        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT employee.id, employee.first_name, employee.last_name, employee.gender, city.city_name " +
                             "FROM employee INNER JOIN city ON employee.city_id = city.city_id WHERE id = 3")) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfEmployee = resultSet.getInt("id");
                System.out.println("ID: " + idOfEmployee);

                String firstOfEmployee = resultSet.getString("first_name");
                String lastOfEmployee = resultSet.getString("last_name");
                String genderOfEmployee = resultSet.getString("gender");
                String cityOfEmployee = resultSet.getString("city_name");

                System.out.println("Имя: " + firstOfEmployee);
                System.out.println("Фамилия: " + lastOfEmployee);
                System.out.println("Пол: " + genderOfEmployee);
                System.out.println("Город: " + cityOfEmployee);
            }

            } catch (SQLException e) {

                System.out.println("Ошибка при подключении к БД!");
                e.printStackTrace();
           }
    }
}

