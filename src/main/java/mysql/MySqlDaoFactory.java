package mysql;

import dao.CategoryDao;
import dao.DaoFactory;
import dao.ResumeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDaoFactory implements DaoFactory {
    private String user = "root";//Логин пользователя.
    private String password="";//Пароль пользователя.
    private String url = "jdbc:mysql://localhost:3306/resume_schema";//URL адрес.
    private String driver = "com.mysql.jdbc.Driver";//Имя драйвера.
    /**
     * @return Подключение к БД.
     * @throws SQLException
     */
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * @param connection Подключение к БД.
     * @return Возвращает объект для управления персистентным состоянием объекта Category.
     */
    @Override
    public CategoryDao getCategoryDao(Connection connection) {
        return new MySqlCategoryDao(connection);
    }

    /**
     * @param connection Подключение к БД.
     * @return Возвращает объект для управления персистентным состоянием объекта Resume.
     */
    @Override
    public ResumeDao getResumeDao(Connection connection) {
        return new MySqlResumeDao(connection);
    }

    public MySqlDaoFactory() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e){
            System.out.println("Класс для соединения с БД не найден.");
            e.printStackTrace();
        }

    }
}
