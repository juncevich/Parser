import dao.DaoFactory;

import java.sql.Connection;

/**
 * Created by Juncevich on 14.12.2015.
 */
public class MySqlCategoryDaoTest {
    @Test
    public void testGetAll() throws Exception {
        DaoFactory daoFactory = new MySqlDaoFactory();
        List<Group> list;
        try (Connection con = daoFactory.getConnection()) {
            GroupDao dao = daoFactory.getGroupDao(con);
            list = dao.getAll();
        }
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0); }
}
