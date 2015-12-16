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


    public static List<Category> getAll() {
        List<Category> categories = new ArrayList<Category>();
        for (int i=0;i < Parser.getCategoryList().size(); i++){
            Category category = new Category();
            category.setRubricName(Parser.getCategoryList().get(i).text());
            category.setRubricNumber(Integer.parseInt(new StringBuffer(Parser.getCategoryList().get(i).attr("href")).toString().replaceAll("[\\D]", "")));
            categories.add(category);
        }
        return categories;
    }

    public Category getCategoryById(int id){
        for (Category category: ParseCategoryDao.getAll()
             ) {
                if (category.getRubricNumber() == id){
                    return category;

                }
            break;
        }

        return null;
    }
}
