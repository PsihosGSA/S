package ua.org.oa.gavrishs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.org.oa.gavrishs.dao.UserDao;
import ua.org.oa.gavrishs.model.User;
import ua.org.oa.gavrishs.services.UserService;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public User create(User user) {
        // При создании


        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    @Transactional
    public List<User> getUsersList() {
        return userDao.getAll();
    }

}
