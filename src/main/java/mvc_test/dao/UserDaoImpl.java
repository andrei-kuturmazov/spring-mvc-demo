package mvc_test.dao;

import lombok.AllArgsConstructor;
import mvc_test.entity.User;
import mvc_test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    @Autowired
    public final JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAllUsers() {
        String sqlRequest = "Select * from t_user";
        return jdbcTemplate.query(sqlRequest, new UserMapper());
    }
}
