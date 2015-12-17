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

    public Resume create() {
        return null;
    }


    public Resume read(int key) {
        return null;
    }


    public void update(Resume resume) {

    }


    public void delete(Resume resume) {

    }


    public List<Resume> getAll() {

        return Parser.getResumeList(1);
    }
}
