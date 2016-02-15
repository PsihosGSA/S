package oracle.academy.dao;

import oracle.academy.model.User;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Anna on 15.02.2016.
 */
public class UserDaoImp implements UserDao{

    private static Map<Long, User> usersMap = new TreeMap<>();

    @Override
    public User create(User user) {
        usersMap.put(user.getId(),user);
        return user;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
