package ua.org.oa.gavrishs.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.org.oa.gavrishs.model.User;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Anna on 15.02.2016.
 */
@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public User create(User user) {
        return null;
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

        Session sess = null;
        List<User> users = new LinkedList<>();

        try {
            sess = sessionFactory.openSession();
            Query q = sess.createQuery("from User");

            // todo - излишне, убрать
            q.list().forEach(userProxy -> {
                users.add(new User((User) userProxy));
            });

        } catch (Exception e) {
            e.printStackTrace();
        }


        return users;
    }
}
