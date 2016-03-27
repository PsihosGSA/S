package ua.org.oa.gavrishs.dao;

import java.util.List;

import ua.org.oa.gavrishs.model.User;

public interface UserDao {

	User create(User user);
	User getById(Long id);
	boolean delete(User user);
	User update(User user);
	List<User> getAll();

}
