import com.Shop.dao.UserDao;
import com.Shop.domain.User;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Алексей on 22.02.2018.
 */
public class main {
    public static void main(String [] args){
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName("Al");
        user.setEmail("@cor");
        user.setPassword("1234");
        userDao.add(user);
    }
}
