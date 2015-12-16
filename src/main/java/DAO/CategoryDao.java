package dao;


import entity.Category;

import java.sql.SQLException;
import java.util.List;

public interface CategoryDao {

    /**
     * Создает новую запись и соответствующий объект.
     * @return Возвращает созданный объект.
     */
    public Category create();

    /**
     * Возвращает объект соответствующий записи с первичным ключом key или null.
     * @param key Первичный ключ.
     * @return
     */
    public Category read (int key) throws SQLException;

    /**
     * Обновляет запись и объект.
     * @param category
     */
    public void update(Category category);

    /**
     * Удаляет запись и объект.
     * @param category
     */
    public void delete(Category category);

     static List<Category> getAll(){
         return null;
     };
}
