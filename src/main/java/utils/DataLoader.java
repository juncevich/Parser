package utils;


import entity.Category;
import entity.Resume;
import parse.ParseCategoryService;
import parse.ParseResumeService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    private static final String url = "jdbc:mysql://localhost:3306/resume_schema";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection con;
    private static PreparedStatement pstmt;
    private static ResultSet rs;
    private String categoryId;
    private Boolean isEmpty;
    /*to do Реализовать проверку таблицы на предмет наличия записей в ней */
    public void getData() throws SQLException {
        isEmpty = false;

        con = DriverManager.getConnection(url, user, password);
        List<Category> categoryList = ParseCategoryService.getAll();
        for (Category category: categoryList
             ) {
            int i = category.getRubricNumber();
            this.categoryId = String.valueOf(i);
            List<Resume> resumeList = Parser.getResumeList(i);
            for (Resume resume: resumeList
                 ) {
                insertResume(resume);
            }
        }

    }

    public void insertResume(Resume resume)throws SQLException{
    pstmt = null;
        try {
            pstmt = con.prepareStatement("INSERT INTO resume (id, category_id, owner_id, wanted_salary, age," +
                    " personal_qualities, institution, education_specialty, education_description, " +
                    "experience, skills) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, resume.getId());
            pstmt.setString(2, categoryId);
            pstmt.setString(3, resume.getOwner_id());
            pstmt.setString(4, resume.getWanted_salary());
            pstmt.setString(5, resume.getAge());
            pstmt.setString(6, resume.getPersonal_qualities());
            pstmt.setString(7, resume.getInstitution());
            pstmt.setString(8, resume.getEducation_specialty());
            pstmt.setString(9, resume.getEducation_description());
            pstmt.setString(10, resume.getExperience());
            pstmt.setString(11, resume.getSkills());

            pstmt.execute();
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }


    }
}
}
