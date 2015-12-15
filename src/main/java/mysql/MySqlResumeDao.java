package mysql;

import dao.ResumeDao;
import entity.Resume;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public class MySqlResumeDao implements ResumeDao{
    private final Connection connection;
    /**
     * Создает новую запись и соответствующий объект.
     *
     * @return Возвращает созданный объект.
     */
    @Override
    public Resume create() {
        return null;
    }

    /**
     * Возвращает объект соответствующий записи с первичным ключом key или null.
     *
     * @param key Первичный ключ.
     * @return
     */
    @Override
    public Resume read(int key) {
        return null;
    }

    /**
     * @param resume
     */
    @Override
    public void update(Resume resume) {

    }

    /**
     * @param resume
     */
    @Override
    public void delete(Resume resume) {

    }

    /**
     * @return
     * @throws SQLException
     */
    @Override
    public List<Resume> getAll() throws SQLException {
        return null;
    }

    public MySqlResumeDao(Connection connection) {
        this.connection = connection;
    }
}
