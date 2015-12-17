package parse;

import dao.CategoryDao;
import dao.ResumeDao;
import entity.Category;
import entity.Resume;
import utils.Parser;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParseResumeService {


    public static List<Resume> getResumeListByCategory(int category) {

        return Parser.getResumeList(category);
    }
}
