package utils;


import entity.Category;
import entity.Resume;
import parse.ParseCategoryService;
import parse.ParseResumeService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataLoader extends Thread{
//    public DataLoader() {
//        try {
//            removeAllData();
//            getData();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }

    private static final String url = "jdbc:mysql://localhost:3306/resume_schema?rewriteBatchedStatements=true";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection con;
    private static PreparedStatement pstmt;
    private static ResultSet rs;
    private String categoryId;
    private Boolean isEmpty;

    public void getData() throws SQLException {

        con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT COUNT(*) FROM resume;");
        if (resultSet.next()) {
            if (resultSet.getInt(1) == 0) {

                pstmt = con.prepareStatement("INSERT INTO resume (id, category_id, owner_id, wanted_salary, age," +
                        " personal_qualities, institution, education_specialty, education_description, " +
                        "experience, skills) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                final int[] j = {0};
                List<Category> categoryList = ParseCategoryService.getAll();
                for (Category category : categoryList
                        ) {
                    int i = category.getRubricNumber();

                    this.categoryId = String.valueOf(i);
                    List<Resume> resumeList = Parser.getResumeList(i);
//                    Thread myThread = new Thread(new Runnable() {
//                        @Override
//                        public void run() {
                            for (Resume resume : resumeList
                                    ) {
                                try {
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
                                    pstmt.addBatch();
                                    System.out.println(j[0]++ + " Загружена запись "+ resume.getId());


                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }


                            }
                        //}
//                    });
//                    myThread.start();

                }
                pstmt.executeBatch();

                pstmt.close();
                con.close();
                System.out.println("Загрузка данных прошла успешно...");
            } else {
                System.out.println("Данные уже загружены ...");
            }

        }



    }

    public void removeAllData() throws SQLException {
        con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        stmt.execute("TRUNCATE TABLE `resume_schema`.`Resume`;");
        stmt.close();
        con.close();
    }



}
