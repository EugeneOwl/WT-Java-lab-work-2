import dao.UserDao;
import dao.impl.UserDaoImpl;

/**
 * @author e.ivanov
 * @since 28.10.2018
 */
public class Application {
    public static void main(String[] args) throws Exception {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.getUser("eugene"));
    }
}
