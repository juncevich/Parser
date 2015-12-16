//import dao.DaoFactory;
//import entity.Category;
//import mysql.MySqlDaoFactory;
//import org.junit.Assert;
//import org.junit.Test;
//import dao.CategoryDao;
//
//import java.sql.Connection;
//import java.util.List;
//
//
//public class MySqlCategoryDaoTest {
//
//    @Test
//    public void testGetAll() throws Exception {
//        DaoFactory daoFactory = new MySqlDaoFactory();
//        List<Category> list;
//        try (Connection con = daoFactory.getConnection()) {
//            CategoryDao dao = daoFactory.getCategoryDao(con);
//            //list = dao.getAll();
//        }
//        //Assert.assertNotNull(list);
//       // Assert.assertTrue(list.size() > 0); }
//}
