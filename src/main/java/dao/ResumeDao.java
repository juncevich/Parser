package dao;

import entity.Resume;

import java.sql.SQLException;
import java.util.List;

public interface ResumeDao {
    /**
     * Создает новую запись и соответствующий объект.
     * @return Возвращает созданный объект.
     */
    public Resume create();

    /**
     * Возвращает объект соответствующий записи с первичным ключом key или null.
     * @param key Первичный ключ.
     * @return
     */
    public Resume read (int key);

    /**
     *
     * @param resume
     */
    public void update(Resume resume);

    /**
     *
     * @param resume
     */
    public void delete(Resume resume);

    /**
     *
     * @return
     * @throws SQLException
     */
    public List<Resume> getAll() throws SQLException;
}
