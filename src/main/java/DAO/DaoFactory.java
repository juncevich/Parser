package dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Фабрика объектов для работы с базой данных.
 */
public interface DaoFactory {
    /**
     *
     * @return Подключение к БД.
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException;

    /**
     *
     * @param connection Подключение к БД.
     * @return Возвращает объект для управления персистентным состоянием объекта Category.
     */
    public CategoryDao getCategoryDao(Connection connection);

    /**
     *
     * @param connection Подключение к БД.
     * @return Возвращает объект для управления персистентным состоянием объекта Resume.
     */
    public ResumeDao getResumeDao(Connection connection);
}
