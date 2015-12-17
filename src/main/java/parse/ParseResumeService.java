package parse;

import entity.Resume;
import utils.Parser;

import java.util.List;

public class ParseResumeService {


    public static List<Resume> getResumeListByCategory(int category) {

        return Parser.getResumeList(category);
    }
}
