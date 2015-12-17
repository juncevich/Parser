package parse;


import dao.CategoryDao;
import entity.Category;

import utils.Parser;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParseCategoryService {

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
        for (Category category: ParseCategoryService.getAll()
             ) {
                if (category.getRubricNumber() == id){
                    return category;

                }
            break;
        }

        return null;
    }
}
