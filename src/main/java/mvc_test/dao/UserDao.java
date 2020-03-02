package mvc_test.dao;

import mvc_test.entity.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
}
