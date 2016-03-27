package ua.org.oa.gavrishs.services;

/**
 * Created by Anna on 29.02.2016.
 */
import ua.org.oa.gavrishs.model.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User getById(Long id);

    void delete(Long id);

    User update(User user);

    List<User> getUsersList();
}
