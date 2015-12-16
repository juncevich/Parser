package parse;

import dao.CategoryDao;
import entity.Category;

import java.sql.SQLException;

public class ParseResumeDao implements CategoryDao{
    @Override
    public Category create() {
        return null;
    }

    @Override
    public Category read(int key) throws SQLException {
        return null;
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(Category category) {

    }
}
