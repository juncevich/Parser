package parse;


import dao.CategoryDao;
import entity.Category;
import utils.Parser;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParseCategoryDao implements CategoryDao {
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

    @Override
    public List<Category> getAll() throws SQLException {
        List<Category> categories = new ArrayList<Category>();
        for (int i=0;i < Parser.getCategoryList().size(); i++){
            Category category = new Category();
            category.setRubricName(Parser.getCategoryList().get(i).text());
            category.setRubricNumber(Parser.getCategoryList().get(i).elementSiblingIndex());
            categories.add(category);
        }
        return categories;
    }
}
