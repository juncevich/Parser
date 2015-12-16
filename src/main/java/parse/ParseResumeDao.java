package parse;

import dao.CategoryDao;
import dao.ResumeDao;
import entity.Category;
import entity.Resume;
import utils.Parser;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ParseResumeDao implements ResumeDao{
    @Override
    public Resume create() {
        return null;
    }

    @Override
    public Resume read(int key) {
        return null;
    }

    @Override
    public void update(Resume resume) {

    }

    @Override
    public void delete(Resume resume) {

    }

    @Override
    public List<Resume> getAll() {

        return Parser.getResumeList(1);
    }
}
