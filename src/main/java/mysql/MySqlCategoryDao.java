package mysql;


import dao.CategoryDao;
import entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlCategoryDao implements CategoryDao {
    private final Connection connection;
    /**
     * Создает новую запись и соответствующий объект.
     *
     * @return Возвращает созданный объект.
     */
    @Override
    public Category create() {
        return null;
    }

    /**
     * Возвращает объект соответствующий записи с первичным ключом key или null.
     *
     * @param key Первичный ключ.
     * @return
     */
    @Override
    public Category read(int key) throws SQLException{
        String sql = "SELECT * FROM resume_schema.Category WHERE id=?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, key);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Category category = new Category();
        category.setId(resultSet.getInt("id"));
        //category.setRubricNumber(resultSet.getInt("rubric_number"));
        category.setRubricName(resultSet.getString("rubric_name"));
        return category;
    }



    /**
     * @param category
     */
    @Override
    public void update(Category category) {

    }

    /**
     * @param category
     */
    @Override
    public void delete(Category category) {

    }

    /**
     * @return
     * @throws SQLException
     */
    //@Override
    public List<Category> getAll() throws SQLException {
        String sql = "SELECT * FROM resume_schema.Category;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Category> categoryList = new ArrayList<Category>();
        while (resultSet.next()){
            Category category = new Category();
            category.setId(resultSet.getInt("id"));
            //category.setRubricNumber(resultSet.getInt("rubric_number"));
            category.setRubricName(resultSet.getString("rubric_name"));
            categoryList.add(category);
        }
        return categoryList;
    }

    public MySqlCategoryDao(Connection connection) {
        this.connection = connection;
    }
}
